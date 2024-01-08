package org.gr40in.core;

public interface ConnectionListener {
    public void connectionOk(ChatConnection connection);

    public void getMessage(String message);

    public void disconnect(ChatConnection connection);
}
