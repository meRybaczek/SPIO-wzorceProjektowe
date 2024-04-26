public class RachunekDebetowy extends RachunekDekorator{

    public RachunekDebetowy(RachunekAbstrakcyjny rachunek) {
        super(rachunek);
    }


    @Override
    public int getSaldo() {
        return super.getSaldo();
    }

    @Override
    public void setDupuszczalnyDebet(int value) {
        if (getSaldo() > 0)
            super.setDupuszczalnyDebet(value);
        else
            System.err.println("Saldo rachunku nie może być mniejsze od zero");
    }

}
