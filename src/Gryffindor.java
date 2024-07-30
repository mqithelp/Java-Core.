public class Gryffindor extends Hogwarts {
    private int nobility; //благородство
    private int honor; // честь
    private int courage; //храбрость

    public Gryffindor(String name, String surname, int powerMagic, int transgression, int nobility, int honor, int courage) {
        super(name, surname, powerMagic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }
}
