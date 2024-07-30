import java.util.List;

//Гриффендор
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

    public void printStudent() {
        super.printStudent();
        System.out.print("Благородство: " + nobility + ". ");
        System.out.print("Честь: " + honor + ". ");
        System.out.print("Храбрость: " + courage + ". \n");
    }

    public int totalPower() {
        return nobility + honor + courage;
    }

    public static void findLeader(Gryffindor studentOne, Gryffindor studentTwo) {
        if (studentOne.totalPower() > studentTwo.totalPower()) {
            System.out.println(studentOne.getName() + " лучший Гриффиндорец, чем " + studentTwo.getName());
        } else {
            System.out.println(studentTwo.getName() + " лучший Гриффиндорец, чем " + studentOne.getName());
        }

    }

}
