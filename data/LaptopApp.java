/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ACER
 */
import java.util.Scanner;

public class LaptopApp {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        int core, ram, stok;
        String name, brand, procie, so, storage;

        System.out.println("Masukan nama Anda\t\t: ");
        name = input.nextLine();

        System.out.println("Masukan nama brand\t\t: ");
        brand = input.nextLine();

        System.out.println("Processor yang diinginkan\t\t: ");
        procie = input.nextLine();

        System.out.println("Sistem Operasi yang diinginkan\t: ");
        so = input.nextLine();

        System.out.println("Jenis Storage yang diinginkan\t: ");
        storage = input.nextLine();

        System.out.println("Jumlah core yang diinginkan\t: ");
        core = input.nextInt();

        System.out.println("Ram yang dibutuhkan\t\t: ");
        ram = input.nextInt();

        System.out.println("Stok yang dibutuhkan\t\t: ");
        stok = input.nextInt();

        System.out.println("----------------------------------");

        System.out.println("Masukan nama Anda: " + name);
        System.out.println("Brand\t\t: " + brand);
        System.out.println("Processor\t\t: " + procie);
        System.out.println("Sistem Operasi\t: " + so);
        System.out.println("Jenis Storage\t: " + storage);
        System.out.println("Jumlah Core\t: " + core);
        System.out.println("Sistem Operasi\t: " + ram + "Gb");
        System.out.println("Stok sebanyak\t: " + stok);
    }
}
