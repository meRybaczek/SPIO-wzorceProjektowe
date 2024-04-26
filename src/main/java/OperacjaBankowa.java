public abstract class OperacjaBankowa {
    public Rachunek rachunek;

    public OperacjaBankowa(Rachunek rachunek) {
        this.rachunek = rachunek;
    }

    public void execute(){};
}
