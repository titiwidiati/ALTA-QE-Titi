import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Perhitungan perhitungan = new Perhitungan();
        String inputlagi;

        System.out.println("Selamat Datang di Kalkulator");

        do{
            System.out.println("Silahkan pilih Perhitungan Kalkulator yang di inginkan");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("Silahkan pilih angka (1/2/3/4) : ");
            String jenis = scan.next();

            if(jenis.equalsIgnoreCase("1")){
                System.out.println("Input Angka Pertama : ");
                float angkapertama = scan.nextFloat();
                System.out.println("Input Angka Kedua : ");
                float angkakedua = scan.nextFloat();
                perhitungan.InputAngka(angkapertama, angkakedua);
                System.out.println("Hasil nya ialah = " + perhitungan.penjumlahan());
                System.out.println("Apakah anda ingin menghitung lagi?(Y/N) : ");
                inputlagi = scan.next();

            } else if (jenis.equalsIgnoreCase("2")){
                System.out.println("Input Angka Pertama : ");
                float angkapertama = scan.nextFloat();
                System.out.println("Input Angka Kedua : ");
                float angkakedua = scan.nextFloat();
                perhitungan.InputAngka(angkapertama, angkakedua);
                System.out.println("Hasil nya ialah = " + perhitungan.pengurangan());
                System.out.println("Apakah anda ingin menghitung lagi?(Y/N) : ");
                inputlagi = scan.next();
            } else if (jenis.equalsIgnoreCase("3")){
                System.out.println("Input Angka Pertama : ");
                float angkapertama = scan.nextFloat();
                System.out.println("Input Angka Kedua : ");
                float angkakedua = scan.nextFloat();
                perhitungan.InputAngka(angkapertama, angkakedua);
                System.out.println("Hasil nya ialah = " + perhitungan.perkalian());
                System.out.println("Apakah anda ingin menghitung lagi?(Y/N) : ");
                inputlagi = scan.next();
            } else if (jenis.equalsIgnoreCase("4")){
                System.out.println("Input Angka Pertama : ");
                float angkapertama = scan.nextFloat();
                System.out.println("Input Angka Kedua : ");
                float angkakedua = scan.nextFloat();
                perhitungan.InputAngka(angkapertama, angkakedua);
                System.out.println("Hasil nya ialah = " + perhitungan.pembagian());
                System.out.println("Apakah anda ingin menghitung lagi?(Y/N) : ");
                inputlagi = scan.next();
            } else {
                System.out.println("Jenis perhitungan yang dipilih Invalid");
                System.out.println("Apakah anda ingin menghitung lagi?(Y/N) : ");
                inputlagi = scan.next();
            }

        } while (inputlagi.equalsIgnoreCase("Y"));


    }
}