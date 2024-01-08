//package org.gr40in.core.consoleTest;
//
//import org.gr40in.core.ChatConnection;
//import org.gr40in.core.ServerCore;
//import org.gr40in.core.message.Message;
//
//import java.io.IOException;
//import java.net.ServerSocket;
//import java.util.ArrayList;
//
//public class ServerConsole extends ServerCore {
//    public ServerConsole() throws IOException {
//        connectionList = new ArrayList<>();
//
//        try (ServerSocket serverSocket = new ServerSocket(5555)) {
//            while (true) {
//                ChatConnection connection = new ChatConnection(serverSocket.accept(), this);
//                connectionList.add(connection);
//                System.out.println("connect ok");
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    @Override
//    public void connectionOk(ChatConnection connection) {
//
//    }
//
//    @Override
//    public void getMessage(String message) {
//
//    }
//
//    @Override
//    public void disconnect(ChatConnection connection) {
//
//    }
//
//    @Override
//    public void sendMessage(Message message) {
//
//    }
//
//    @Override
//    public void startServer() {
//
//    }
//
//    @Override
//    public void stopServer() {
//
//    }
//}
