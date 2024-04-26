import java.util.HashMap;

public class Bank {
    private final HashMap<String, Rachunek> rachunki = new HashMap<>();

    public Bank() {
    }

    public Rachunek zalozRachunek(String numer, String imie, String nazwisko) {
        Rachunek rach = new Rachunek(numer, imie, nazwisko);
        rachunki.put(numer, rach);
        return rach;
    }

}

