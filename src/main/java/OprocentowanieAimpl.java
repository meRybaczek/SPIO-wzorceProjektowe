public class OprocentowanieAimpl implements Oprocentowanie {
    public OprocentowanieAimpl() {
    }
    @Override
    public int oblicz(int saldo) {
        if (saldo <= 1000) {
            return (int)(0.03 * (double)saldo);
        } else {
            return saldo <= 2000 ? (int)(0.04 * (double)saldo) : (int)(0.05 * (double)saldo);
        }
    }
}

