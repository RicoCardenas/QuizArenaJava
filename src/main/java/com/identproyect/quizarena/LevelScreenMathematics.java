package com.identproyect.quizarena;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class LevelScreenMathematics {
    @FXML
    private Button levelMathematics;
    @FXML
    private Button level1;
    @FXML
    private Button level2;
    @FXML
    private Button level3;
    @FXML
    private Button level4;
    @FXML
    private Button level5;
    @FXML
    private Button level6;
    @FXML
    private Button level7;
    @FXML
    private Button level8;
    @FXML
    private Button level9;
    @FXML
    private Button level10;
    String selectLevel;
    public void initialize() {
        level1.setOnAction(e -> System.out.println("cuanto es 2+2"));
        level2.setOnAction(e -> System.out.println("cuanto es 3+3"));
        level3.setOnAction(e -> System.out.println("cuanto es 4+4"));
        level4.setOnAction(e -> System.out.println("cuanto es 5+5"));
        level5.setOnAction(e -> System.out.println("cuanto es 6+6"));
        level6.setOnAction(e -> System.out.println("cuanto es 7+7"));
        level7.setOnAction(e -> System.out.println("cuanto es 8+8"));
        level8.setOnAction(e -> System.out.println("cuanto es 9+9"));
        level9.setOnAction(e -> System.out.println("cuanto es 10+10"));
        level10.setOnAction(e -> System.out.println("cuanto es 11+11"));
    }
}
