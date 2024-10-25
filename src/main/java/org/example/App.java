package org.example;

public class App {

    public static void main (String[] args){
        System.out.println ("Welcome to Java!!!!");
        Color color1 = new Color ("Green", 20211);
        Color color2 = new Color ("Yellow", 20212);
        Color color3 = new Color ();


        color1.colorMessage();
        color2.colorMessage();
        color3.colorMessage();
    }
}
