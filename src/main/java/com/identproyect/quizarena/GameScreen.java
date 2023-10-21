package com.identproyect.quizarena;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class GameScreen {

    @FXML
    private ImageView characterImage;
    @FXML
    private ImageView playerCharacterImage;

    private Character playerCharacter; // Variable para almacenar el personaje del jugador

    public void initialize() {
        // Cargar la imagen del personaje
        if (playerCharacter != null) {
            Image character = playerCharacter.getImage();
            characterImage.setImage(character);
            Circle clip = new Circle(characterImage.getFitWidth() / 2, characterImage.getFitHeight() / 2, characterImage.getFitWidth() / 2);
            characterImage.setClip(clip);
        }
    }


    @FXML
    private void handleMathButtonClick() {
        // Lógica para el botón de Matemáticas
        try {
            // Abre la ventana de selección de personajes
            FXMLLoader loader = new FXMLLoader(getClass().getResource("level-screen-mathematics.fxml"));
            Parent root = loader.load();

            Stage characterSelectionStage = new Stage();
            characterSelectionStage.setTitle("Selección de Personajes");
            characterSelectionStage.setScene(new Scene(root));
            characterSelectionStage.show();

            LevelScreenMathematics controller = loader.getController();
            controller.openFullScreen();  // Abre en pantalla completa

            //controller.setHelloController(this);  // Establece el controlador de HelloController


        } catch (IOException e) {
            e.printStackTrace();
        }
        // Aquí puedes abrir la pantalla de Matemáticas o ejecutar alguna otra acción
    }

    @FXML
    private void handleHistoryButtonClick() {
        // Lógica para el botón de Historia
        try {
            // Abre la ventana de selección de personajes
            FXMLLoader production = new FXMLLoader(getClass().getResource("level-screen-history.fxml"));
            Parent root = production.load();

            Stage characterSelectionStage = new Stage();
            characterSelectionStage.setTitle("Selección de Personajes");
            characterSelectionStage.setScene(new Scene(root));
            characterSelectionStage.show();

            LevelScreenHistory control = production.getController();
            control.openFullScreenH();  // Abre en pantalla completa
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleSpanishButtonClick() {
        // Lógica para el botón de Español
        System.out.println("Has seleccionado Español");

        // Aquí puedes abrir la pantalla de Español o ejecutar alguna otra acción
    }

    @FXML
    private void handleScienceButtonClick() {
        // Lógica para el botón de Ciencias Naturales
        System.out.println("Has seleccionado Ciencias Naturales");
        // Aquí puedes abrir la pantalla de Ciencias Naturales o ejecutar alguna otra acción
    }

    @FXML
    public void setPlayerCharacter(Character playerCharacter) {
        Image image = new Image(getClass().getResourceAsStream(playerCharacter.getImagePath()));
        playerCharacterImage.setImage(image);
        Circle clip = new Circle(playerCharacterImage.getFitWidth() / 2, playerCharacterImage.getFitHeight() / 2, playerCharacterImage.getFitWidth() / 2);
        playerCharacterImage.setClip(clip);
    }
    public void setCharacterImage(Image characterImage) {
        this.characterImage.setImage(characterImage);
        Circle clip = new Circle(this.characterImage.getFitWidth() / 2, this.characterImage.getFitHeight() / 2, this.characterImage.getFitWidth() / 2);
        this.characterImage.setClip(clip);
    }
}
