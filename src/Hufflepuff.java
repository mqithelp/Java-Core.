public class Hufflepuff extends Hogwarts {
    //hard work, loyalty, honor
    private int hardWork; // трудолюбие
    private int loyalty; // верность
    private int honor; // честь

    public Hufflepuff(String name, String surname, int powerMagic, int transgression, int hardWork, int loyalty, int honor) {
        super(name, surname, powerMagic, transgression);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honor = honor;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }
}
