package org.example;

/**
 *
 * @author panos
 */
public class LightWithInt implements Switchable, Dimmable {
   
    private static final int DEFAULT_INTENSITY = 100;
    private static final int MINIMUM_INTENSITY = 0;
    private int intensity;
    
    public LightWithInt (){
        setIntensity(DEFAULT_INTENSITY);
    }
    
    public LightWithInt (int intensity){
        setIntensity (intensity);
        
    }
    
    private void setIntensity (int intensity){
        this.intensity = intensity;
    }
    
    private int getIntensity (){
        return this.intensity;
    }
    
    public boolean isOn (){
        return this.getIntensity() > MINIMUM_INTENSITY; 
    }
    
    public void turnOn (){
        if (this.isOn()){
            System.out.println ("The light is already on!!!");
        }else {
            setIntensity(DEFAULT_INTENSITY);
        }
    }
    
    public void turnOff (){
        if (this.isOn()){
            setIntensity (MINIMUM_INTENSITY);
        }else {
            System.out.println ("The ligh is already off!!");
        }
    }
    
    public void dim(){
        setIntensity(--this.intensity);
    }
    
    public void brighten(){
        setIntensity(++this.intensity);
    }
    
    public void message(){
        System.out.println ("We are inside the class Light with intensity, in the method message()");
    }

}
