import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputlagi2;
        System.out.println("Selamat Datang di Perhitungan Volume Bangun Ruang");

        do{
            System.out.println("Silahkan pilih bangun ruang yang ingin dihitung");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Tabung");
            System.out.println("Silahkan pilih angka (1/2/3) : ");
            String jenis = scan.next();

            if (jenis.equalsIgnoreCase("1")){
                System.out.println("Masukkan nilai sisi kubus : ");
                double sisi = scan.nextDouble();
                Kubus hasilkubus = new Kubus(sisi);
                System.out.println("Hasil volume kubus = " +hasilkubus.VolumeKubus());
                System.out.println("Apakah anda ingin menghitung lagi?(Y/N) : ");
                inputlagi2 = scan.next();
            } else if (jenis.equalsIgnoreCase("2")){
                System.out.println("Masukkan nilai panjang balok : ");
                double panjang = scan.nextDouble();
                System.out.println("Masukkan nilai lebar balok : ");
                double lebar = scan.nextDouble();
                System.out.println("Masukka nilai tinggi balok : ");
                double tinggi = scan.nextDouble();
                Balok hasilbalok = new Balok(panjang, lebar, tinggi);
                System.out.println("Hasil volume balok = " +hasilbalok.VolumeBalok());
                System.out.println("Apakah anda ingin menghitung lagi?(Y/N) : ");
                inputlagi2 = scan.next();
            } else if (jenis.equalsIgnoreCase("3")) {
                System.out.println("Masukkan nilai jari-jari tabung : ");
                double jarijari = scan.nextDouble();
                System.out.println("Masukkan nilai tinggi tabung : ");
                double tinggi2 = scan.nextDouble();
                Tabung hasiltabung = new Tabung(jarijari, tinggi2);
                System.out.println("Hasil volume tabung = " +hasiltabung.VolumeTabung());
                System.out.println("Apakah anda ingin menghitung lagi?(Y/N) : ");
                inputlagi2 = scan.next();
            } else {
                System.out.println("Jenis bangun ruang yang dipilih Invalid");
                System.out.println("Apakah anda ingin menghitung lagi?(Y/N) : ");
                inputlagi2 = scan.next();
            }
        } while (inputlagi2.equalsIgnoreCase("Y"));

    }
}