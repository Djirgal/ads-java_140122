package lesson2.HW;

import java.util.Random;

public class Notebook {
    private int price;
    private int memory;
    private String brand;


    public Notebook(int price, int memory, String brand) {
        this.price = price;
        this.memory = memory;
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public int getMemory() {
        return memory;
    }

    public String getBrand() {
        return brand;
    }
}
