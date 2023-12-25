package org.gr40in.core.repo;

import org.gr40in.core.message.Message;
import org.gr40in.core.message.User;

public interface DataBase {
    public void addToSystemLog(Message message);
    public void addToChatLog(Message message);
    public Message userRegister(User user);
    public User logIn(String name, String password);
    public void logOut (User user);
}
