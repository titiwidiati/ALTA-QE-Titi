public class PersegiPanjang {
    double panjang2;
    double lebar2;

    public PersegiPanjang(double panjang2, double lebar2) {
        this.panjang2 = panjang2;
        this.lebar2 = lebar2;
    }

    public double LuasPersPanjang (){
        return panjang2*lebar2;
    }
    public  double KelPersPanjang (){
        return 2*(panjang2+lebar2);
    }
}
