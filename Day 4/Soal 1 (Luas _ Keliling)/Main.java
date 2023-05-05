import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputlagi;
        System.out.println("Selamat Datang di Perhitungan Luas & Keliling Bangun Datar");

        do {
            System.out.println("Silahkan pilih bangun datar yang ingin dihitung");
            System.out.println("1. Persegi");
            System.out.println("2. Segitiga");
            System.out.println("3. Persegi Panjang");
            System.out.println("Silahkan pilih angka (1/2/3) : ");
            String jenis = scan.next();

            if(jenis.equalsIgnoreCase("1")){
                System.out.println("Input sisi persegi : ");
                int sisi = scan.nextInt();
                Persegi hasilpersegi = new Persegi(sisi);
                System.out.println("hasil luas persegi = " +hasilpersegi.LuasPersegi());
                System.out.println("hasil keliling persegi = " +hasilpersegi.KelilingPersegi());
                System.out.println("Apakah anda ingin menghitung lagi?(Y/N) : ");
                inputlagi = scan.next();

            } else if(jenis.equalsIgnoreCase("2")){
                System.out.println("Input alas segitiga : ");
                double alas = scan.nextDouble();
                System.out.println("Input tinggi segitiga : ");
                double tinggi = scan.nextDouble();
                Segitiga hasilsegitiga = new Segitiga(alas, tinggi);
                System.out.println("hasil luas segitiga = " +hasilsegitiga.LuasSegitiga());
                System.out.println("hasil keliling segitiga = " +hasilsegitiga.KelilingSegitiga());
                System.out.println("Apakah anda ingin menghitung lagi?(Y/N) : ");
                inputlagi = scan.next();

            } else if(jenis.equalsIgnoreCase("3")){
                System.out.println("Input panjang persegi panjang : ");
                double panjang2 = scan.nextInt();
                System.out.println("Input lebar persegi panjang : ");
                double lebar2 = scan.nextInt();
                PersegiPanjang hasilppanjang = new PersegiPanjang(panjang2, lebar2);
                System.out.println("hasil luas persegi panjang = " +hasilppanjang.LuasPersPanjang());
                System.out.println("hasil keliling persegi panjang = " +hasilppanjang.KelPersPanjang());
                System.out.println("Apakah anda ingin menghitung lagi?(Y/N) : ");
                inputlagi = scan.next();

            } else {
                System.out.println("Jenis bangun datar yang dipilih Invalid");
                System.out.println("Apakah anda ingin menghitung lagi?(Y/N) : ");
                inputlagi = scan.next();
            }
        } while (inputlagi.equalsIgnoreCase("Y"));

    }
}