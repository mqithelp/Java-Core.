import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Replace> replaces = new ArrayList<Replace>();
        replaces.add(new Car("car1",4));
        replaces.add(new Car("car2",4));
        replaces.add(new Truck("truck1",6));
        replaces.add(new Truck("truck2",8));
        replaces.add(new Bicycle("bicycle1",2));
        replaces.add(new Bicycle("bicycle2",2));

        ServiceStation station = new ServiceStation();
        for (Replace transport : replaces) {
            station.check(transport);
        }


    }
}