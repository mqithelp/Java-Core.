public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри", "Поттер", 95, 90, 98, 85, 80),
                new Gryffindor("Гермиона", "Грейнджер", 90, 95, 92, 98, 75),
                new Gryffindor("Рон", "Уизли", 85, 80, 88, 75, 70),
        };

        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария", "Смит", 75, 80, 85, 70, 65),
                new Hufflepuff("Седрик", "Диггори", 90, 92, 88, 85, 80),
                new Hufflepuff("Джастин", "Финч-Флетчли", 82, 85, 80, 75, 70),
        };

        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу", "Чанг", 88, 90, 85, 92, 80, 75),
                new Ravenclaw("Падма", "Патил", 90, 92, 88, 85, 82, 78),
                new Ravenclaw("Маркус", "Белби", 85, 88, 82, 80, 78, 72),
        };

        Slytherin[] slytherins = {
                new Slytherin("Драко", "Малфой", 88, 90, 92, 85, 95, 80, 78),
                new Slytherin("Грэхэм", "Монтегю", 82, 85, 88, 80, 90, 75, 72),
                new Slytherin("Грегори", "Гойл", 75, 78, 80, 72, 85, 70, 68),
        };
        gryffindors[0].printStudent();
        hufflepuffs[0].printStudent();
//        ravenclaws[0].printStudent();
//        slytherins[0].printStudent();

    }
}