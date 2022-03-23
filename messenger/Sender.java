/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package messenger;

/**
 *
 * @author ACER
 */
public class Sender {
    public static void main(String[] args) {
        StdMessenger std = new StdMessenger();
        System.out.println("StdMessenger\n");
        std.sendMessage("", "Test", "Halo!");
        std.sendMessage("Tarnished", "Maiden", "Do you accept my offer?");
        
        MailMessenger mail = new MailMessenger();
        System.out.println("MailMessenger\n");
        mail.connect();
        mail.sendMessage("", "Secret", "Don't tell anyone!");
        mail.sendMessage("Erdtree", "Burn", "Burned...");
        mail.disconnect();
        mail.sendMessage("Ranni", "Gift", "Elden Ring");
    }
}
