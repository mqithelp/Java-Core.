public class Person {
    public String name;
    public String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return name + ' ' + surname;
    }

    public void changePerson(Person person) {
        person = new Person("Ilya", "Lagutenko");

    }
}
