package com.identproyect.quizarena;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class LevelScreenHistory {
    @FXML
    private Button levelHistory;
    @FXML
    private Button level1History;
    @FXML
    private Button level2History;
    @FXML
    private Button level3History;
    @FXML
    private Button level4History;
    @FXML
    private Button level5History;
    @FXML
    private Button level6History;
    @FXML
    private Button level7History;
    @FXML
    private Button level8History;
    @FXML
    private Button level9History;
    @FXML
    private Button level10History;

    String selectLevel;

    public void initialize() {
        level1History.setOnAction(e -> System.out.println("cuanto es 2+2"));
        level2History.setOnAction(e -> System.out.println("cuanto es 3+3"));
        level3History.setOnAction(e -> System.out.println("cuanto es 4+4"));
        level4History.setOnAction(e -> System.out.println("cuanto es 5+5"));
        level5History.setOnAction(e -> System.out.println("cuanto es 6+6"));
        level6History.setOnAction(e -> System.out.println("cuanto es 7+7"));
        level7History.setOnAction(e -> System.out.println("cuanto es 8+8"));
        level8History.setOnAction(e -> System.out.println("cuanto es 9+9"));
        level9History.setOnAction(e -> System.out.println("cuanto es 10+10"));
        level10History.setOnAction(e -> System.out.println("cuanto es 11+11"));
    }
    public void openFullScreenH() {
    }
}
