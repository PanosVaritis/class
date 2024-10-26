package org.example;

public class Light {
    private int intensity;
    public static final int MAX_INTENSITY = 100;
    public static final int MIN_INTENSITY = 0;
    
    public Light(){
        setIntensity(MAX_INTENSITY);
    }
    
    public Light (int intensity){
        setIntensity(intensity);
    }
    
    private void setIntensity (int intensity){
        this.intensity = intensity;
    }
    
    protected int getIntensity (){
        return this.intensity;
    }
    
    protected boolean isOn (){
        return this.intensity >= MAX_INTENSITY;
    }
    
    public void turnOn (){
        if (this.isOn()){
            System.out.println ("The light is already on!!!!");
        }else {
            setIntensity (MAX_INTENSITY);
        }
    }
    
    public void turnOff (){
        if (this.isOn()){
            setIntensity (MIN_INTENSITY);
        }else {
            System.out.println ("The light is already off");
        }
    }
    
    public void message (){
        System.out.println ("Status of the current light:");
        if (this.isOn()){
            System.out.println ("The light is on, and thge intensity is "+getIntensity()+" amber");
        }else {
            System.out.println ("The light is off, and the intensity is "+getIntensity()+" amber");
        }
    }
    
    public void putEco (){
        if (this.isOn()){
            this.turnOff();
            System.out.println ("Think about the environment and close the light!!!");
            this.message();
        }else {
            System.out.println ("Finally someone with common sense!!!");
            this.message();
        }
    }
    
    public void putEco (Light li){
        if (li.isOn()){
            li.turnOff();
            System.out.println ("Since the light was oppend we closed it for you!!! Try to be eco friendly");
        }else {
            System.out.println ("We noticed that the light was already closed..Thank you!!!");
        }
    }
    
    protected void increaseIntensity(){
        this.intensity++;
    }
    
    protected void decreaseIntensity(){
        this.intensity--;
    }  
    
    
    public void messageForAllChilds (){}
    
}
