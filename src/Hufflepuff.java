//Пуффендуй
public class Hufflepuff extends Hogwarts {
    private int hardWork; // трудолюбие
    private int loyalty; // верность
    private int honor; // честь

    public Hufflepuff(String name, String surname, int powerMagic, int transgression, int hardWork, int loyalty, int honor) {
        super(name, surname, powerMagic, transgression);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honor = honor;
    }

       public void printStudent(){
        super.printStudent();
        System.out.print("Трудолюбие: " + hardWork + ". ");
        System.out.print("Верность: " + loyalty + ". ");
        System.out.print("Честь: " + honor + ". \n");
    }
    public int totalPower() {
        return hardWork + honor + loyalty;
    }

    public static void findLeader(Hufflepuff studentOne, Hufflepuff studentTwo) {
        if (studentOne.totalPower() > studentTwo.totalPower()) {
            System.out.println(studentOne.getName() + " лучший Пуффендуец, чем " + studentTwo.getName());
        } else {
            System.out.println(studentTwo.getName() + " лучший Пуффендуец, чем " + studentOne.getName());
        }

    }
}
