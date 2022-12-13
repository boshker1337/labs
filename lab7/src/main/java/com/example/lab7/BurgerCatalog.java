package com.example.lab7;

public class BurgerCatalog {
    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getCost() {
        return Coast;
    }

    public void setCoast(Double coast) {
        Coast = coast;
    }

    public BurgerCatalog(int image, String name, Double coast) {
        Image = image;
        Name = name;
        Coast = coast;
    }

    private int Image;
    private String Name;
    private Double Coast;
}
