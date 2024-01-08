package org.gr40in.core.repo;

import org.gr40in.core.message.Message;
import org.gr40in.core.message.User;

public class JsonRepo implements DataBase{
    @Override
    public void addToSystemLog(Message message) {

    }

    @Override
    public void addToChatLog(Message message) {

    }

    @Override
    public Message userRegister(User user) {
        return null;
    }

    @Override
    public User logIn(String name, String password) {
        return null;
    }

    @Override
    public void logOut(User user) {

    }
}
