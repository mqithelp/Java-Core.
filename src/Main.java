import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Transport> transports = new ArrayList<Transport>();
        transports.add(new Car("car1",4));
        transports.add(new Car("car2",4));
        transports.add(new Truck("truck1",6));
        transports.add(new Truck("truck2",8));
        transports.add(new Bicycle("bicycle1",2));
        transports.add(new Bicycle("bicycle2",2));

        ServiceStation station = new ServiceStation();
        for (Transport transport : transports) {
            station.check(transport);
        }

    }
}