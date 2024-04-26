import java.util.ArrayList;

public class Wyplata extends OperacjaBankowa {
    private final int kwotaWyplaty;

    public Wyplata(Rachunek rachunek, int kwotaWyplaty) {
        super(rachunek);
        this.kwotaWyplaty = kwotaWyplaty;
    }

    @Override
    public void execute() {

        int saldo = rachunek.getSaldo();
        int debet = rachunek.getDopuszczalnyDebet();
        ArrayList<String> historia = rachunek.getHistoria();


        if (saldo   + debet >= kwotaWyplaty) {
            saldo -= kwotaWyplaty;
            historia.add("Wypłata: " + kwotaWyplaty + ", saldo: " + saldo);
        } else {
            historia.add("Nieudana wypłata: " + kwotaWyplaty + ", saldo: " + saldo);
        }

        rachunek.setSaldo(saldo);
        rachunek.setHistoria(historia);
    }
}
