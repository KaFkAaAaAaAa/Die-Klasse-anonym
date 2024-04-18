import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> uczniowie = new ArrayList<>();

        uczniowie.add("FRYTA");
        uczniowie.add("ROOOOOCH");
        uczniowie.add("Bald MAn");
        uczniowie.add("Kerszo");
        uczniowie.add("Michu 'Śliwa' Śliwoski");
        uczniowie.add("Dziadyga");
        uczniowie.add("Bo Sinn");
        uczniowie.add("Ojciec twojego ojca");
        uczniowie.add("Gojciech Wontarek");
        uczniowie.add("Pali sie pokrzywa");

        uczniowie.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        System.out.println("Sortowanie po długości: " + uczniowie);

        uczniowie.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println("Sortowanie alfabetyczne: " + uczniowie);

        uczniowie.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()){
                    return o1.compareTo(o2);
                }
                return o1.length() - o2.length();
            }
        });

        System.out.println(uczniowie);

        Druzyna stolec = new Druzyna("Iskra Stolec");
        Druzyna krysztal = new Druzyna("Krysztal Targowek");
        Druzyna hrubieszow = new Druzyna("Krysztal Hrubieszow");

        Mecz mecz1sk = new Mecz(stolec, krysztal, 1);
        Mecz mecz2hs = new Mecz(hrubieszow, stolec, -1);
        Mecz mecz3kh = new Mecz(krysztal, hrubieszow, 0);

        
    }
}