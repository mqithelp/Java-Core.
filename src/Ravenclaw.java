public class Ravenclaw extends Hogwarts {
    //ум, мудрость, остроумие творчество.
    //intelligence, wisdom, wit, creativity.
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, String surname, int powerMagic, int transgression, int intelligence, int wisdom, int wit, int creativity) {
        super(name, surname, powerMagic, transgression);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

}
