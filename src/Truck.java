public class Truck extends Transport implements Replace {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
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
