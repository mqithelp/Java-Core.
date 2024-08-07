public class Car extends Transport implements CheckEngine {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку на автомобиле.");
    }

    public void checkEngine() {
        System.out.println("Проверяем бензиновый двигатель автомобиля.");
    }

}
