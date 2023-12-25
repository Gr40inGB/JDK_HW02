package org.gr40in.core;

import org.gr40in.core.ChatConnection;
import org.gr40in.core.repo.DataBase;

import java.util.List;

public abstract class ServerCore {

    private int port;
    private DataBase dataBase;
    private List<ChatConnection> connectionList;


}
