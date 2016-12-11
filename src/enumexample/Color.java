/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumexample;

/**
 *
 * @author Daniel
 */
public enum Color {
    GREEN(0, 255, 0), LAWNGREEN(124, 252, 0), CHARTREUSE(127, 255, 0), LIMEGREEN(50, 205, 50);

    private int red;
    private int green;
    private int blue;

    //konstruktor   
    private Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    //getters
    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    //metod
    public String colorCode() {
        return String.format("rgb(%d,%d,%d)", red, green, blue);
    }

}
