public class WyborOprocentowania extends OperacjaBankowa {
    private final Oprocentowanie oprocentowanie;

    public WyborOprocentowania(Rachunek rachunek, Oprocentowanie oprocentowanie) {
        super(rachunek);
        this.oprocentowanie = oprocentowanie;
    }

    @Override
    public void execute() {
        rachunek.setOprocentowanie(oprocentowanie);


    }
}
