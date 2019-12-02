package com.slkrk.spellbinder;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;

import java.awt.*;
import java.util.logging.Logger;

public class Controller {

    @FXML
    private Pane mainPane;

    @FXML
    protected void onKeyReleased(KeyEvent keyEvent) {
        Logger.getAnonymousLogger().info("Pressed key: " + keyEvent.getText());
    }

}
