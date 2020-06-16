package pl.camp.it;

public class Silnia {
    public static void main(String[] args) {
        System.out.println(silnia(13));

        String a = "ABC";

        a.length();

    }

    public static int silnia(int a) {
        if(a > 0) {
            return a * silnia(a-1);
        } else {
            return 1;
        }

    }
}
