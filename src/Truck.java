public class Truck extends Transport implements CheckEngine, CheckTrailer {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку на грузовике.");
    }


    public void checkEngine() {
        System.out.println("Проверяем дизельный двигатель грузовика.");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп грузовика.");
    }
    public void toDoWell() {
        changeWheels();
        checkEngine();
        checkTrailer();
        System.out.println("Сделано всё супер хорошо! Класс Грузовик");
    }
}
