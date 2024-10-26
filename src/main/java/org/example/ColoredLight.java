package org.example;

public class ColoredLight extends Light{

    private Color color;
    
    
    public ColoredLight (int intensity, Color color){
        super(intensity);
        setColor (color);
    }
    
    private void setColor (Color color){
        this.color = color;
    }
    
    private Color getColor (){
        return this.color;
    }
    
   public void coloredLightMessage (){
       System.out.println ("Lets analyse a few things about the particular light!!!!");
       this.message();
       this.getColor().colorMessage();
   }


}
