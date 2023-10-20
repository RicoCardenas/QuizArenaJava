package com.identproyect.quizarena;

import javafx.scene.image.Image;

import java.net.URL;

public class Character {
    static URL url = Character.class.getResource("/images/quizQuieto.png");
    static Image image1 = new Image(url.toString());
    static URL url1 = Character.class.getResource("/images/Circulo.png");
    static Image image2 = new Image(url1.toString());
    static URL url2 = Character.class.getResource("/images/Equiz.png");
    static Image image3 = new Image(url2.toString());
    public static final Character CHARACTER_1 = new Character("Personaje 1", image1, 100, 20);

    public static final Character CHARACTER_2 = new Character("Personaje 2", image2, 120, 40);

    public static final Character CHARACTER_3 = new Character("Personaje 3", image3, 140, 30);
    private String name;
    private Image image;
    private int health;
    private int attack;

    public Character(String name, Image image, int health, int attack) {
        this.name = name;
        this.image = image;
        this.health = health;
        this.attack = attack;
    }

    // Getters y setters para acceder a las propiedades

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public String getImagePath() {
        // Devuelve la ruta de la imagen para este personaje
        if (this == CHARACTER_1) {
            return "/images/quizQuieto.png";
        } else if (this == CHARACTER_2) {
            return "/images/Circulo.png";
        } else if (this == CHARACTER_3) {
            return "/images/Equiz.png";
        }
        return null; // Maneja otros casos según sea necesario
    }
}
