package org.example;

public class Color {
    private String color;
    private int colorNumber;

    public Color (){}

    public Color (String color, int colorNumber){
        setColor(color);
        setColorNumber(colorNumber);
    }

    public String getColor (){
        return this.color;
    }

    public int getColorNumber (){
        return this.colorNumber;
    }

    private void setColor (String color){
        this.color = color;
    }

    private void setColorNumber (int colorNumber){
        this.colorNumber = colorNumber;
    }

    public void colorMessage (){
        System.out.println ("The unique color number is: "+getColorNumber());
        System.out.println ("The color is: "+getColor());
    }
}
