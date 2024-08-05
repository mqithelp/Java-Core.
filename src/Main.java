import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Replace> replaces = new ArrayList<Replace>();
        replaces.add(new Bicycle("bicycle1",2));
        replaces.add(new Bicycle("bicycle2",2));

        ServiceStation station = new ServiceStation();
        station.check(replaces.get(1));

    }
}