public class TotalOngkir extends HitungDimensi{
    double totalharga;

    public void HitungOngkir(){
        double volume = Math.floor((this.panjang * this.lebar * this.tinggi) / 50);

        if (volume > Math.floor(this.berat)){
            totalharga = volume * 5000;
            System.out.println("Harga Ongkos Kirim = Rp."+totalharga);
        } else if (volume < Math.floor(this.berat)){
            totalharga = Math.floor(this.berat) * 5000;
            System.out.println("Harga Ongkos Kirim = Rp."+totalharga);
        } else if (volume == Math.floor(this.berat)){
            totalharga = Math.floor(this.berat) * 5000;
            System.out.println("Harga Ongkos Kirim = Rp."+totalharga);
        }
    }
}
