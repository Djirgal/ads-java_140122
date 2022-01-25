package lesson2.HW;

import lesson2.SpeedTest;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {

        final int SIZE = 10000;
        Notebook[] notebooksArray = NotebookArray.getNotebookArray(SIZE);

        SpeedTest.startTime();

        for (int i = 0; i < SIZE; i++) {
            System.out.println("i= "+ i +" price= "+ notebooksArray[i].getPrice() + "memory=" + notebooksArray[i].getMemory() + "brand= " + notebooksArray[i].getBrand());
        }

        SpeedTest.endTime();

    }
}
