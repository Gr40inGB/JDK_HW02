package org.gr40in.core;

import org.gr40in.core.repo.DataBase;
import org.gr40in.core.repo.JsonRepo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Properties;

public abstract class ServerCore implements Server {

    private final int DEFAULT_PORT = 5555;

    private int port;
    private DataBase dataBase;
    protected List<ChatConnection> connectionList;
    private ServerSocket serverSocket;
    private boolean serverOnline;


    public ServerCore(int port) {
        if (port < 1024 || port > 49151) throw new IllegalArgumentException("Wrong post number");
        this.port = port;
        this.dataBase = new JsonRepo();
        try {
            serverSocket = new ServerSocket(port);
            serverOnline = false;
            System.out.println("server created, but not started");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ServerCore() {
        this(getDefaultPort());
    }


    private static int getDefaultPort() {
        Properties conf = new Properties();
        try {
            conf.load(new InputStreamReader(Files.newInputStream(
                    Paths.get("chat/src/main/resources/org/gr40in/chat.properties"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return Integer.parseInt(conf.getProperty("defaultPort"));
    }

    public synchronized void sendMessage(String message) {
//        if (!message.isEmpty()) writeToLog(message + "\n");
        try {
            for (ChatConnection connection : connectionList) {
                connection.sendMessageThroughConnection(message);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public List<ChatConnection> getConnectionList() {
        return connectionList;
    }
}
