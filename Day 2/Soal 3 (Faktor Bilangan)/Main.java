import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Selamat Datang :)");

        Scanner input = new Scanner(System.in);
        System.out.println("Input angka yang di inginkan : ");
        int angka = input.nextInt();
        System.out.println("Daftar Angka untuk faktor bilangan " +angka+ " ialah");
        for(int i = 1; i<=angka; i++){
            if(angka % i == 0){
                System.out.print(i+" ");
            }
        }

        }

    }