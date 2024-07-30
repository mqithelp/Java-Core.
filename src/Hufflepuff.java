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

}
