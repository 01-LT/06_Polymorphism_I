package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
    Queen queen = new Queen();
    Worker worker = new Worker();
    Drone drone = new Drone();
    // HoneyBee hb = new HoneyBee();

        pollObj(queen);
        pollObj(worker);
        pollObj(drone);
        // pollObj(hb);
 
        // HoneyBee bee = new HoneyBee();
        // output(bee.doYourJob());
    }

    private static void pollObj(HoneyBee bee) {
		output(bee.doYourJob());
        output(bee.fly());
		
	} 

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

