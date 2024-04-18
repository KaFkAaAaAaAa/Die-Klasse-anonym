public class Mecz {
    private Druzyna druzyna1;
    private Druzyna druzyna2;
    private int wynik;

    public Mecz(Druzyna druzyna1, Druzyna druzyna2, int wynik) {
        this.druzyna1 = druzyna1;
        this.druzyna2 = druzyna2;
        this.wynik = wynik;
    }

    public int getWynik() {
        return wynik;
    }

    public void setWynik(int wynik) {
        this.wynik = wynik;
    }

    @Override
    public String toString() {
        return "Mecz{" +
                "druzyna1='" + druzyna1 + '\'' +
                ", druzyna2='" + druzyna2 + '\'' +
                ", wynik=" + wynik +
                '}';
    }
}
