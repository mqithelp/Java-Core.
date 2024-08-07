public class Truck extends Transport implements CheckEngine, CheckTrailer {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку на грузовике.");
    }

    @Override
    void service() {
        checkEngine();
        checkTrailer();
    }

    public void checkEngine() {
        System.out.println("Проверяем дизельный двигатель грузовика.");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп грузовика.");
    }

}
