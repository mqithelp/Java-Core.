public class Car extends Transport implements CheckEngine, ToDoWell {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку на автомобиле.");
    }

    public void checkEngine() {
        System.out.println("Проверяем бензиновый двигатель автомобиля.");
    }
    public void toDoWell() {
        changeWheels();
        checkEngine();
        System.out.println("Сделано всё супер хорошо! Класс Автомобиль");

    }
}
