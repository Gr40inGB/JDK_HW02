package org.gr40in.core;

import java.io.*;
import java.net.Socket;

public class ChatConnection extends Thread {
    Socket socket;
    ConnectionListener listener;
    BufferedReader bufferedReader;
    BufferedWriter bufferedWriter;


    public ChatConnection(String ip, int port, ConnectionListener listener) throws IOException {
        this(new Socket(ip, port), listener);
    }

    public ChatConnection(Socket socket, ConnectionListener listener) throws IOException {
        this.listener = listener;
        this.socket = socket;
        if (socket != null) listener.connectionOk(this);
        bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        this.start();
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                listener.getMessage(bufferedReader.readLine());
            }
        } catch (IOException e) {
            listener.disconnect(this);
        }
    }

    public synchronized void sendMessageThroughConnection(String message) throws IOException {
        bufferedWriter.write(message + "\n");
        bufferedWriter.flush();
    }

}
