//Когтевран
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

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    public void printStudent(){
        super.printStudent();
        System.out.print("Ум: " + intelligence + ". ");
        System.out.print("Мудрость: " + wisdom + ". ");
        System.out.print("Остроумие: " + wit + ". ");
        System.out.print("Творчество: " + creativity + ". \n");
    }
}
