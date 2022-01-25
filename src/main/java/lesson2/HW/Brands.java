package lesson2.HW;

import java.util.Random;

public enum Brands {
    Lenuvo, Asos, MacNote, Eser, Xamiou;

    private static Random random = new Random();
    private static int brandNumber = values().length;


    public static Brands getRandomBrand() {
        return values()[random.nextInt(brandNumber)];
    }
}
