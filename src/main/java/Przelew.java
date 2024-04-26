public class Przelew extends OperacjaBankowa {
    private final Rachunek rachunekOdbiorcy;
    private final int kwotaPrzelewu;


    public Przelew(Rachunek rachunek, Rachunek rachunekOdbiorcy, int kwotaPrzelewu) {
        super(rachunek);
        this.rachunekOdbiorcy = rachunekOdbiorcy;
        this.kwotaPrzelewu = kwotaPrzelewu;
    }

    @Override
    public void execute() {
        Wyplata wyplata = new Wyplata(rachunek, kwotaPrzelewu);
        rachunek.wykonajOpercjeBankowa(wyplata);

        Wplata wplata = new Wplata(rachunekOdbiorcy, kwotaPrzelewu);
        rachunekOdbiorcy.wykonajOpercjeBankowa(wplata);


    }

}
