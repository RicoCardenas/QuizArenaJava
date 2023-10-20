package com.identproyect.quizarena;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloController {
    @FXML
    protected void startGame() {
        try {
            // Abre la ventana de selección de personajes
            FXMLLoader loader = new FXMLLoader(getClass().getResource("character-selection.fxml"));
            Parent root = loader.load();

            Stage characterSelectionStage = new Stage();
            characterSelectionStage.setTitle("Selección de Personajes");
            characterSelectionStage.setScene(new Scene(root));
            characterSelectionStage.show();

            CharacterSelection controller = loader.getController();
            controller.openFullScreen();  // Abre en pantalla completa

            controller.setHelloController(this);  // Establece el controlador de HelloController

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}