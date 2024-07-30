public class Hogwarts {
    private String name;
    private String surname;
    private int powerMagic;
    private int transgression;
    private String[] facilitys = {"Слизерин", "Пуффендуй", "Когтевран", "Гриффиндор"};

    public Hogwarts(String name, String surname, int powerMagic, int transgression) {
        this.name = name;
        this.surname = surname;
        this.powerMagic = powerMagic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
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
        System.out.print("Студент факультета \"" + facilitys[i] + "\"\t " + this.getName() + " "
                + this.getSurname() + ". \tСила магии: " + this.getPowerMagic()
                + ". Дальность телепортации: " + this.getTransgression() + ". ");
    }
}
