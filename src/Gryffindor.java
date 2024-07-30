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

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public void printStudent(){
        super.printStudent();
        System.out.print("Благородство: " + nobility + ". ");
        System.out.print("Честь: " + honor + ". ");
        System.out.print("Храбрость: " + courage + ". \n");
    }
}
