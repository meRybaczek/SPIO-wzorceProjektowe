public class OprocentowanieBimpl implements Oprocentowanie {
    public OprocentowanieBimpl() {
    }
    @Override
    public int oblicz(int saldo) {
        if (saldo <= 2000) {
            return (int)(0.03 * (double)saldo);
        } else {
            return saldo <= 4000 ? (int)(0.04 * (double)saldo) : (int)(0.05 * (double)saldo);
        }
    }
}
