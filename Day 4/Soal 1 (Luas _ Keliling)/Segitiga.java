public class Segitiga {
    double alas;
    double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double LuasSegitiga(){
        return (alas*tinggi)/2;
    }
    public double KelilingSegitiga(){
        double miring;
        miring = Math.sqrt((alas*alas)+(tinggi*tinggi));
        return alas+tinggi+miring;
    }
}
