public class Starter {
    public Starter() {
    }

    public static void main(String[] args) {
        Bank bank = new Bank();

        Rachunek rachKowalski = bank.zalozRachunek("1", "Jan", "Kowalski");
        WyborOprocentowania wyborOprocentowania = new WyborOprocentowania(rachKowalski, new OprocentowanieCimpl());
        rachKowalski.wykonajOpercjeBankowa(wyborOprocentowania);

        Wplata wplataKowalski = new Wplata(rachKowalski, 500);
        rachKowalski.wykonajOpercjeBankowa(wplataKowalski);

        Wyplata wyplataKowalski = new Wyplata(rachKowalski, 300);
        rachKowalski.wykonajOpercjeBankowa(wyplataKowalski);

        Rachunek rachNowak = bank.zalozRachunek("1", "Jan", "Nowak");

        Wplata wplataNowak = new Wplata(rachNowak, 500);
        rachKowalski.wykonajOpercjeBankowa(wplataNowak);

        Wyplata wyplataNowak = new Wyplata(rachNowak, 300);
        rachKowalski.wykonajOpercjeBankowa(wyplataNowak);

        Przelew przelew = new Przelew(rachNowak, rachKowalski, 33);
        rachNowak.wykonajOpercjeBankowa(przelew);

        RachunekDebetowy rachunekDebetowy = new RachunekDebetowy(rachKowalski);
        rachunekDebetowy.setDupuszczalnyDebet(1500);
        System.out.println(rachKowalski.getDopuszczalnyDebet());

        rachKowalski.piszHistorie();
        rachNowak.piszHistorie();


    }
}

