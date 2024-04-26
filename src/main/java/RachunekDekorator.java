public abstract class RachunekDekorator implements RachunekAbstrakcyjny{
    RachunekAbstrakcyjny rachunekAbstrakcyjny;

    public RachunekDekorator(RachunekAbstrakcyjny rachunekAbstrakcyjny) {
        this.rachunekAbstrakcyjny = rachunekAbstrakcyjny;
    }

    public int getSaldo(){
        return rachunekAbstrakcyjny.getSaldo();
    };

    public void setDupuszczalnyDebet(int value) {
        rachunekAbstrakcyjny.setDupuszczalnyDebet(value);
    }
}

