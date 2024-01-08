package org.gr40in.fxServer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.gr40in.core.ChatConnection;
import org.gr40in.core.ServerCore;
import org.gr40in.core.message.Message;
import org.gr40in.core.repo.DataBase;

public class ServerFxController extends ServerCore {

    @FXML
    private TextField fieldPort;

    @FXML
    private Label labelPort;

    @FXML
    void startServer(ActionEvent event) {
        startServer();
    }

    @FXML
    void stopServer(ActionEvent event) {
        stopServer();
    }

    @Override
    public void startServer() {
        System.out.println("startser");
    }

    @Override
    public void stopServer() {
        System.out.println("stop");
    }



    @Override
    public void connectionOk(ChatConnection connection) {

    }

    @Override
    public void getMessage(String message) {

    }

    @Override
    public void disconnect(ChatConnection connection) {

    }

    @Override
    public void sendMessage(Message message) {

    }

}
