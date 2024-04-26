import java.util.ArrayList;

public class Rachunek implements RachunekAbstrakcyjny {
    private final String numerRachunku;
    private final String imie;
    private final String nazwisko;
    private int saldo;
    private int dopuszczalnyDebet;
    private ArrayList<String> historia = new ArrayList<>();
    private Oprocentowanie oprocentowanie = new OprocentowanieAimpl();


    public Rachunek(String numer, String imie, String nazwisko) {
        this.numerRachunku = numer;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.saldo = 0;
    }
    @Override
    public int getSaldo() {
        return saldo;
    }

    @Override
    public void setDupuszczalnyDebet(int value) {
        this.dopuszczalnyDebet = value;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getDopuszczalnyDebet() {
        return dopuszczalnyDebet;
    }

    public ArrayList<String> getHistoria() {
        return historia;
    }

    public void setHistoria(ArrayList<String> historia) {
        this.historia = historia;
    }


    public void setOprocentowanie(Oprocentowanie oprocentowanie) {
        this.oprocentowanie = oprocentowanie;
    }

    public void wykonajOpercjeBankowa(OperacjaBankowa operacjaBankowa) {
        operacjaBankowa.execute();
    }


    public void piszHistorie() {
        System.out.println(historia);
    }

    public int odsetki() {
        int odsetki = oprocentowanie.oblicz(saldo);
        historia.add("Naliczono odsetki w kwocie " + odsetki);
        return odsetki;
    }
}
