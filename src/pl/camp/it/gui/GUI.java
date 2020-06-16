package pl.camp.it.gui;

import pl.camp.it.db.Repository;
import pl.camp.it.exceptions.ZepsuloSieException;
import pl.camp.it.model.Product;
import pl.camp.it.model.WeightProduct;

import java.util.Scanner;

public class GUI {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Repository repository = new Repository();

    public static void showMainMenu() {
        System.out.println("1. Lista produktów");
        System.out.println("2. Kup produkt");
        System.out.println("3. Exit");

        switch (scanner.nextLine()) {
            case "1":
                //System.out.println(repository.getProductList());
                for(Product temporary : repository.getProductList()) {
                    if(temporary.getTotalAmount() > 0) {
                        System.out.println(temporary);
                    }
                }
                showMainMenu();
                break;
            case "2":
                sellProduct();
                showMainMenu();
                break;
            case "3":
                System.exit(0);
                break;
                default:
                    System.out.println("Nieprawidłowy wybór !!");
                    showMainMenu();
                    break;
        }
    }

    private static void sellProduct() {
        boolean productExistFlag = false;
        System.out.println("Podaj nazwe produktu:");
        String productName = scanner.nextLine();
        for (Product temp : repository.getProductList()) {
            if(temp.getName().equals(productName)) {
                productExistFlag = true;
                if(temp instanceof WeightProduct) {
                    System.out.println("Podaj ilość w gramach:");
                    int ilosc;
                    try {
                        ilosc = readInteger();
                        System.out.println("A");
                        System.out.println("B");
                    } catch (NumberFormatException |
                            NullPointerException |
                            IndexOutOfBoundsException e) {
                        System.out.println("Cos się zepsuło !!");
                        e.printStackTrace();
                        return;
                    } finally {
                        System.out.println("Zawsze !!");
                    }
                    if(ilosc <= temp.getTotalAmount()) {
                        temp.setTotalAmount(temp.getTotalAmount()-ilosc);
                        System.out.println("Zakup zakończony !!");
                    } else {
                        System.out.println("Brak towaru w podanej ilości !!");
                    }
                } else {
                    if(temp.getTotalAmount() > 0) {
                        temp.setTotalAmount(temp.getTotalAmount() - 1);
                        System.out.println("Zakup zakończony !!");
                    } else {
                        System.out.println("Brak towaru !!");
                    }
                }
                break;
            }
        }
        if(!productExistFlag) {
            System.out.println("Nie znaleziono produktu !!");
        }
    }

    private static int readInteger() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            throw new ZepsuloSieException();
        }

    }

    private static int readInteger2() {
        String input = scanner.nextLine();
        char[] chars = input.toCharArray();
        for (char znak : chars) {
            if(znak != '0' &&
            znak != '1' &&
            znak != '2' &&
            znak != '3' &&
            znak != '4' &&
            znak != '5' &&
            znak != '6' &&
            znak != '7' &&
            znak != '8' &&
            znak != '9') {
                throw new ZepsuloSieException();
            }
        }
        return Integer.parseInt(input);
    }
}
