package org.gr40in.core;

import org.gr40in.core.message.Message;

public interface Server extends ConnectionListener {
    public void sendMessage(Message message);
    public void startServer();
    public void stopServer();
}
