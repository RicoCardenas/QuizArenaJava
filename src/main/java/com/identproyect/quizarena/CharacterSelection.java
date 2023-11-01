package com.identproyect.quizarena;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Screen;
import javafx.stage.Stage;
import java.io.IOException;

public class CharacterSelection{

    private HelloController helloController;



    // Método para establecer el controlador de HelloController
    public void setHelloController(HelloController helloController) {
        this.helloController = helloController;
    }
    @FXML
    private ImageView characterImage1;
    @FXML
    private ImageView characterImage2;
    @FXML
    private ImageView characterImage3;

    @FXML
    private Button character1;
    @FXML
    private Button character2;
    @FXML
    private Button character3;
    private Character selectedCharacter; // Variable para almacenar el personaje seleccionado

    @FXML
    public void initialize() {
        // Cargar las imágenes de los personajes
        Image image1 = new Image(getClass().getResourceAsStream("/images/magoquieto.png"));
        Image image2 = new Image(getClass().getResourceAsStream("/images/vikingograndequieto.png"));
        Image image3 = new Image(getClass().getResourceAsStream("/images/marcianitogrande.png"));

        // Asignar las imágenes a los ImageView
        characterImage1.setImage(image1);
        characterImage2.setImage(image2);
        characterImage3.setImage(image3);

        // Configurar controladores de eventos para los botones de selección de personajes
        character1.setOnAction(e -> selectCharacter(Character.CHARACTER_1));
        character2.setOnAction(e -> selectCharacter(Character.CHARACTER_2));
        character3.setOnAction(e -> selectCharacter(Character.CHARACTER_3));
    }

    public void openFullScreen(){
        //Obtener la pantalla principal
        Screen screen = Screen.getPrimary();
        Stage stage = (Stage) characterImage1.getScene().getWindow();
        stage.setFullScreen(true);

        //Configurar la ventana para que este en pantalla completa
        stage.setX(screen.getVisualBounds().getMinX());
        stage.setY(screen.getVisualBounds().getMinY());
        stage.setWidth(screen.getVisualBounds().getWidth());
        stage.setHeight(screen.getVisualBounds().getHeight());
    }

    public Character getSelectedCharacter() {
        return selectedCharacter;
    }
    private void selectCharacter(Character character) {
        // Resaltar el botón del personaje seleccionado (cambia su estilo, por ejemplo)
        if (character == Character.CHARACTER_1) {
            character1.setStyle("-fx-background-color: yellow;"); // Cambia el color de fondo
            character2.setStyle(""); // Restaura el estilo de los otros botones
            character3.setStyle("");
        } else if (character == Character.CHARACTER_2) {
            character1.setStyle("");
            character2.setStyle("-fx-background-color: yellow;");
            character3.setStyle("");
        } else   if (character == Character.CHARACTER_3) {
            character1.setStyle("");
            character2.setStyle("");
            character3.setStyle("-fx-background-color: yellow;");
        }
        // Almacena el personaje seleccionado en la variable selectedCharacter
        selectedCharacter = character;

        // Llama al método startGame() para cargar la interfaz de GameScreen
        startGame();
    }
    @FXML
    protected void startGame() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("game-screen.fxml"));
            Parent root = loader.load();
            // Obtén una instancia del controlador de GameScreen
            GameScreen gameScreenController = loader.getController();
            gameScreenController.setPlayerCharacter(selectedCharacter);
            // Crea una nueva escena y muéstrala en una nueva ventana
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
            //Pantalla completa
            stage.setFullScreen(true);
            // Cierra la ventana de selección de personajes
            ((Stage) characterImage1.getScene().getWindow()).close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
