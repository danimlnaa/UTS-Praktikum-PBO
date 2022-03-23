/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data2;

/**
 *
 * @author ACER
 */

public class Application {
    public static void main(String[] args) {
        
        Axioo axioo = new Axioo("AXIOO PICO CJMD825 Black", "Axioo", "Intel Atom D2500", 
                "2", "DOS", "2", "HDD", 5);
        System.out.println("Laptop Axioo");
        System.out.println(axioo);
        axioo.getDisplay();
        axioo.getGraphic();
        
        
        Dell dell = new Dell("Dell Inspiron 11-3162", "Dell", "Intel Celeron N3060", 
                "2", "DOS", "2", "SSD SATA", -2);
        System.out.println("\nLaptop Dell");
        System.out.println(dell);
        dell.getDisplay();
        dell.getGraphic();
    }
}
