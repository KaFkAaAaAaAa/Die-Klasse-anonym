import java.util.ArrayList;

public class Druzyna {
    private String nazwa;
    private final ArrayList<Mecz> mecze = new ArrayList<>();
    public Druzyna(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    @Override
    public String toString() {
        return "Druzyna{" +
                "nazwa='" + nazwa + '\'' +
                '}';
    }
}
