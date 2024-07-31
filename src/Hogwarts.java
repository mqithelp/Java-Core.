public class Hogwarts {
    private String name;
    private String surname;
    private int powerMagic;
    private int transgression;
    private final String[] faculties = {"Слизерин", "Пуффендуй", "Когтевран", "Гриффиндор"};

    public Hogwarts(String name, String surname, int powerMagic, int transgression) {
        this.name = name;
        this.surname = surname;
        this.powerMagic = powerMagic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void printStudent() {
        int i = 0;
        switch (this.getClass().getName()) {
            case "Slytherin":
                i = 0;
                break;
            case "Hufflepuff":
                i = 1;
                break;
            case "Ravenclaw":
                i = 2;
                break;
            case "Gryffindor":
                i = 3;
                break;
        }
        System.out.print("Студент факультета \"" + faculties[i] + "\"\t " + this.getName() + " "
                + this.getSurname() + ". \tСила магии: " + this.getPowerMagic()
                + ". Дальность телепортации: " + this.getTransgression() + ". ");
    }

    public int getTotalPowerStudent() {
        return powerMagic + transgression;
    }

    public static void findLeaderSchool(Hogwarts studentOne, Hogwarts studentTwo) {

        if (studentOne.getTotalPowerStudent() > studentTwo.getPowerMagic()) {
            System.out.println(studentOne.getName() + " " + studentOne.getSurname() +
                    " обладает бОльшей мощностью магии, чем " + studentTwo.getName() + " " + studentTwo.getSurname());
        } else {
            System.out.println(studentTwo.getName() + " " + studentTwo.getSurname() +
                    " обладает бОльшей мощностью магии, чем " + studentOne.getName() + " " + studentOne.getSurname());
        }
    }
}
