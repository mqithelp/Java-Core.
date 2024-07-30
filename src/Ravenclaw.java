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

    public void printStudent() {
        super.printStudent();
        System.out.print("Ум: " + intelligence + ". ");
        System.out.print("Мудрость: " + wisdom + ". ");
        System.out.print("Остроумие: " + wit + ". ");
        System.out.print("Творчество: " + creativity + ". \n");
    }

    public int totalPower() {
        return intelligence + wisdom + wit + creativity;
    }

    public static void findLeader(Ravenclaw studentOne, Ravenclaw studentTwo) {
        if (studentOne.totalPower() > studentTwo.totalPower()) {
            System.out.println(studentOne.getName() + " лучший Когтевранец, чем " + studentTwo.getName());
        } else {
            System.out.println(studentTwo.getName() + " лучший Когтевранец, чем " + studentOne.getName());
        }

    }
}
