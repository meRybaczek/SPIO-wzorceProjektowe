public class OprocentowanieDimpl implements Oprocentowanie {
    public OprocentowanieDimpl() {
    }
    @Override
    public int oblicz(int saldo) {
        return (int)(0.2 * (double)saldo);
    }
}
