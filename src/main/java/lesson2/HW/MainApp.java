package lesson2.HW;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {

        final int SIZE = 10;
        Notebook[] notebooksArray = NotebookArray.getNotebookArray(SIZE);
        for (int i = 0; i < SIZE; i++) {
            System.out.println("i = " + i  + " price ="+ notebooksArray[i].getPrice()+ " memory = " + notebooksArray[i].getMemory()+ "brand = " + notebooksArray[i].getBrand());
        }

    }
}
