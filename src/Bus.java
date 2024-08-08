public class Bus extends Transport implements CheckEngine {
    @Override
    public void toDoWell() {
        changeWheels();
        checkEngine();
    }

    public Bus(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    void updateTyre() {
        System.out.println("Меняем покрышки автобусу");
    }

    @Override
    public void checkEngine() {
        System.out.println("Копаемся в моторе автобуса");
    }
}
