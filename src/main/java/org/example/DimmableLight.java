package org.example;

public class DimmableLight extends Light{
        
    public DimmableLight (int intensity){
        super(intensity);
    }
    
    public void dim(){
        decreaseIntensity();
    }
    
    public void brighten(){
        increaseIntensity();   
    }
    
    @Override
    public void message(){
        System.out.println ("intensity = "+this.getIntensity());
        
    }
}
