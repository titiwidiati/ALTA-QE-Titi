import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kata yang diinginkan : ");
        String kata = input.nextLine();
        String balik = "";

        Parlindrome(kata, balik);
    }

    private static void Parlindrome(String kata, String balik) {
        int length = kata.length();
        for (int i = length - 1; i >= 0; i--) {
            balik = balik + kata.charAt(i);
        }
        if (kata.equals(balik)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}