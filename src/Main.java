import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Gryffindor> gryffindors = new ArrayList<>();
    public static List<Hufflepuff> hufflepuffs = new ArrayList<>();
    public static List<Ravenclaw> ravenclaws = new ArrayList<>();
    public static List<Slytherin> slytherins = new ArrayList<>();

    public static void main(String[] args) {
        init();
        try {
            Hogwarts.findLeaderSchool(gryffindors.get(2), slytherins.get(0));
            Gryffindor.findLeader(gryffindors.get(2), gryffindors.get(1));
            Hufflepuff.findLeader(hufflepuffs.get(2), hufflepuffs.get(0));
            Ravenclaw.findLeader(ravenclaws.get(0), ravenclaws.get(2));
            Slytherin.findLeader(slytherins.get(1),slytherins.get(2));
        } catch (Exception e) {
            System.out.println("Упссс....");
            throw new IndexOutOfBoundsException();
        }

        for(Gryffindor student : gryffindors) {
            student.printStudent();
        }

    }

    public static void init() {
        gryffindors.add(new Gryffindor("Гарри", "Поттер", 95, 90, 98, 85, 80));
        gryffindors.add(new Gryffindor("Гермиона", "Грейнджер", 90, 95, 92, 98, 75));
        gryffindors.add(new Gryffindor("Рон", "Уизли", 85, 80, 88, 75, 70));

        hufflepuffs.add(new Hufflepuff("Захария", "Смит", 75, 80, 85, 70, 65));
        hufflepuffs.add(new Hufflepuff("Седрик", "Диггори", 90, 92, 88, 85, 80));
        hufflepuffs.add(new Hufflepuff("Джастин", "Финч-Флетчли", 82, 85, 80, 75, 70));

        ravenclaws.add(new Ravenclaw("Чжоу", "Чанг", 88, 90, 85, 92, 80, 75));
        ravenclaws.add(new Ravenclaw("Падма", "Патил", 90, 92, 88, 85, 82, 78));
        ravenclaws.add(new Ravenclaw("Маркус", "Белби", 85, 88, 82, 80, 78, 72));

        slytherins.add(new Slytherin("Драко", "Малфой", 88, 90, 92, 85, 95, 80, 78));
        slytherins.add(new Slytherin("Грэхэм", "Монтегю", 82, 85, 88, 80, 90, 75, 72));
        slytherins.add(new Slytherin("Грегори", "Гойл", 75, 78, 80, 72, 85, 70, 68));
    }

}