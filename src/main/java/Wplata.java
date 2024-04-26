import java.util.ArrayList;

public class Wplata extends OperacjaBankowa {
    private final int kwotaWplaty;


    public Wplata(Rachunek rachunek, int kwotaWplaty) {
        super(rachunek);
        this.kwotaWplaty = kwotaWplaty;
    }



    @Override
    public void execute() {
        int saldo = rachunek.getSaldo();
        ArrayList<String> historia = rachunek.getHistoria();

        saldo += kwotaWplaty;
        historia.add("Wpłata: " + kwotaWplaty + ", saldo: " + saldo);

        rachunek.setSaldo(saldo);
        rachunek.setHistoria(historia);
    }
}
