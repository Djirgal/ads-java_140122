package lesson2.HW;

import java.util.Random;

public class NotebookArray {

    protected static int priceStep = 50;
    protected static int priceMin = 500;
    protected static int priceMax = 2000;
    protected static int[] MEMORY_LIST = {4, 8, 12, 16, 20, 24};
    private static final Random random = new Random();

    public static Notebook[] getNotebookArray(int length) {
        Notebook[] notebooks = new Notebook[length];
        int priceDelta = priceMax - priceMin;
        for (int i = 0; i < length; i++) {
            notebooks[i] = new Notebook(priceMin + random.nextInt( priceDelta/priceStep)* priceStep, MEMORY_LIST[random.nextInt(MEMORY_LIST.length)], String.valueOf(Brands.getRandomBrand()));
        }
        return notebooks;
    }
}
