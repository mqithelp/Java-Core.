public class Car extends Transport implements Replace {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public int getTransportWheelsCount() {
        return super.getWheelsCount();
    }
    @Override
    public String getTransportName(){
        return super.getModelName();
    }
}
