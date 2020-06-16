package pl.camp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Wyjatki {
    public static void main(String[] args) {
        try {
            blad();
        } catch (FileNotFoundException e) {
            System.out.println("Zepsuło się !!");
        }

    }

    public static void blad() throws FileNotFoundException {
        File file = new File("C:\\Users\\pankaj\\Desktop\\test.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

    }
}
