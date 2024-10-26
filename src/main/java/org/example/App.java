package org.example;

public class App {

    public static void main (String[] args){        
        
       Light bedroomLight = new LightWithInt (200);
       Light kitchenLight = new LightOnOff (true);
       
       
       LightWithInt livingRoomLight = new LightWithInt (100);
       LightOnOff bathroomLight = new LightOnOff (false );
       
       
      livingRoomLight.printMessage();
      bathroomLight.print();
      
      System.out.println (bedroomLight.getIntensity());
      System.out.println (kitchenLight.getIntensity());
    
    
    
    }
}