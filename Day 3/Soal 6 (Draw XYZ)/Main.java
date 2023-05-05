import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka : ");
        int angka = input.nextInt();

        drawbaris(angka);

    }

    private static void drawbaris(int angka) {
        int huruf = 1;
        for (int i = 1; i <= angka; i++) {
            for (int j = 1; j <= angka; j++) {
                System.out.print(drawisi(huruf)+ " ");
                huruf++;
            }
            System.out.println();
        }
    }
    private static char drawisi (int huruf){
    char result;
    if(huruf % 3 ==0){
        result = 'X';
    } else if (huruf % 2==0){
        result = 'Z';
    } else {
        result = 'Y';
    }
    return result;
    }
}