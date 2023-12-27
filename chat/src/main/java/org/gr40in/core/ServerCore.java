package org.gr40in.core;

import org.gr40in.core.ChatConnection;
import org.gr40in.core.repo.DataBase;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.List;

public abstract class ServerCore implements Server {

    private int port;
    private DataBase dataBase;
    protected List<ChatConnection> connectionList;

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
