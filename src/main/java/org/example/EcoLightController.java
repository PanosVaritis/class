package org.example;

public class EcoLightController {
   
    public void putLightInEcoMode (Light li){
        if (li.isOn()){
            System.out.println ("We noticed that you are careless and we are closing the light for you!!");
            li.turnOff();
        }else {
            System.out.println ("The light is already off. No further action is needed!!");
        }
    }
}
