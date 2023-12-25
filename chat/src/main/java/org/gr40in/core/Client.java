package org.gr40in.core;

import org.gr40in.core.message.User;

public interface Client extends ConnectionListener {
    public User logIn(String name, String password);
}
