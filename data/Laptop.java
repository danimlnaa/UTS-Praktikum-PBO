/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ACER
 */
public class Laptop {

    Laptop(String name, String brand, String procie, String so, String storage) {
        this.name = name;
        this.brand = brand;
        this.procie = procie;
        this.so = so;
        this.storage = storage;
    }
    
    Laptop(String name, String brand, String procie, String so, String storage, int core, int ram, int stok) {
        this.name = name;
        this.brand = brand;
        this.procie = procie;
        this.so = so;
        this.storage = storage;
        this.core = core;
        this.ram = ram;
        this.stok = stok;
    }
    
    String name, brand, procie, so, storage;
    int core, ram, stok;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public String getProcie() {
        return procie;
    }
    
    public void setProcie(String procie) {
        this.procie = procie;
    }
    
    public String getSo() {
        return so;
    }
    
    public void setSo(String so) {
        this.so = so;
    }
    
    public String getStorage() {
        return storage;
    }
    
    public void setStorage(String storage) {
        this.storage = storage;
    }
    
    public int getCore() {
        return core;
    }
    
    public void setCore(int core) {
        this.core = core;
    }
    
    public int getRam() {
        return ram;
    }
    
    public void setRam(int ram) {
        this.ram = ram;
    }
    
    public int getStok() {
        return stok;
    }
    
    public void setStok(int stok) {
        this.stok = stok;
    }
}

