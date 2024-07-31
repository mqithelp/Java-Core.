//Слизерин
public class Slytherin extends Hogwarts {
    //хитрость, решительность, амбициозность, находчивость, власть
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int power;

    public Slytherin(String name, String surname, int powerMagic, int transgression, int cunning, int determination, int ambition, int resourcefulness, int power) {
        super(name, surname, powerMagic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.power = power;
    }

    public void printStudent() {
        super.printStudent();
        System.out.print("Хитрость: " + cunning + ". ");
        System.out.print("Решительность: " + determination + ". ");
        System.out.print("Амбициозность: " + ambition + ". ");
        System.out.print("Находчивость: " + resourcefulness + ". ");
        System.out.print("Власть: " + power + ". \n");
    }

    public int totalPower() {
        return cunning + determination + ambition + resourcefulness + power;
    }

    public static void findLeader(Slytherin studentOne, Slytherin studentTwo) {
        if (studentOne.totalPower() > studentTwo.totalPower()) {
            System.out.println(studentOne.getName() + " лучший Слизеринец, чем " + studentTwo.getName());
        } else {
            System.out.println(studentTwo.getName() + " лучший Слизеринец, чем " + studentOne.getName());
        }

    }
}