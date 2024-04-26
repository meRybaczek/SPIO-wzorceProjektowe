public class OprocentowanieCimpl implements Oprocentowanie {
    public OprocentowanieCimpl() {
    }
    @Override
    public int oblicz(int saldo) {
        if (saldo <= 1000) {
            return (int)(0.05 * (double)saldo);
        } else {
            return saldo <= 2000 ? (int)(0.09 * (double)saldo) : (int)(0.05 * (double)saldo);
        }
    }
}
