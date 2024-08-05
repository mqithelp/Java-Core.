public class Bicycle extends Transport implements Replace {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
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
