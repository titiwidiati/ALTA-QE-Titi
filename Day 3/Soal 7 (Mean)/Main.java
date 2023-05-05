import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan total panjang array yang di inginkan: ");
        int panjang = input.nextInt();

        System.out.println("Hasil Mean nya ialah " +mean(panjang));
    }
    private static float mean(int panjang){
        Scanner input = new Scanner(System.in);
        int angkaarray[] = new int[panjang];
        float jumlah = 0;
        float hasil =0;

        for(int i=0; i<= panjang-1; i++){
            System.out.println("Masukkan angka ke - " +(i+1));
            angkaarray[i]=input.nextInt();
        }

        for(int i=0; i<= panjang-1; i++){
            jumlah = jumlah + angkaarray[i];
        }
        return hasil = jumlah/angkaarray.length;
    }
}