package org.example;

/**
 *
 * @author panos
 */
public class LightOnOff implements Light{
    //the valye True stands for open light and the value false stands for closed light
    private boolean active;
    
    public LightOnOff (boolean active){
        this.active = active;
    }
    
    public void turnOn(){
        if (this.isOn()){
            System.out.println ("Light already on!!");
        }else {
            this.active = true;
        }
        
    }
    
    public void turnOff (){
        if (this.isOn()){
            this.active = false;
        }else {
            System.out.println ("Light already off!!");
        }
        
    }
    
    public boolean isOn (){
        return this.active = true;
    }   

    public int getIntensity (){
        return -1;
    }

    public void print (){
        System.out.println ("We are inside the class Light On either Off");
    }

}
    
