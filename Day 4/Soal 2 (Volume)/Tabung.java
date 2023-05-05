public class Tabung {
    double jarijari;
    double tinggi2;

    public Tabung(double jarijari, double tinggi2) {
        this.jarijari = jarijari;
        this.tinggi2 = tinggi2;
    }

    public double VolumeTabung(){
        return (22*jarijari*jarijari/7)*tinggi2;
    }
}
