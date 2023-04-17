import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {


        UJK ujk = new UJK("UJK", "Uniwersytet", "Kielce", "dziekanat");
        Politechnika_Sw politechnika_sw = new Politechnika_Sw("PSw", "Politechnika", "Kielce", "kierunki");
        System.out.println(ujk);
        System.out.println(politechnika_sw);

    }
}