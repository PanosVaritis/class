package org.example;

/**
 *
 * @author panos
 */
public class LightWithInt implements Light {
    //the light works with intensity. When 0 the ligh is cloded. With anyhing else the light is open
    private int intensity;
    
    public LightWithInt (int intensity){
        setIntensity(intensity);
    }
    
    private void setIntensity (int intensity){
        this.intensity = intensity;
    }
    
    
    public void turnOn (){
        if (this.isOn()){
            System.out.println ("The light is already on!!!");
        }else {
            setIntensity(1);
        }
        
        
    }
    
    public void turnOff (){
        if (this.isOn()){
            setIntensity(0);
        }else {
            System.out.println ("The light was alredy off");
        }
        
    }
    
    public boolean isOn(){
        return this.intensity >= 0;
    }
    
    public int getIntensity (){
        return this.intensity;
    }
}
