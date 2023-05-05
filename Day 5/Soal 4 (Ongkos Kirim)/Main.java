import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TotalOngkir hitung = new TotalOngkir();
        String pilih;

        System.out.println("Selamat Datang di Perhitungan Ongkos Kirim");

        do{
            hitung.InputInformasi();
            hitung.HitungOngkir();
            System.out.print("Apakah ingin menghitung lagi?(Y/N) : ");
            pilih = input.next();
            if (pilih.equalsIgnoreCase("N")){
                System.out.println("Terima Kasih :)");
            }
        } while (pilih.equalsIgnoreCase("Y"));
    }
}