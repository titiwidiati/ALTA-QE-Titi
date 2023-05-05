import java.sql.Struct;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat Datang ");
        System.out.println("Masukkan angka yang di inginkan : ");
        int angka = input.nextInt();
        System.out.println(Prime(angka));
    }
    public static boolean Prime (int angka){
        if(angka ==1){
            return false;
        }

        for (int i = 2; i<angka; i++){
            if (angka % i ==0){
                return false;
            }
        }
        return true;
    }

}