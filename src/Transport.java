public abstract class Transport {
    private String modelName;
    private int wheelsCount;
    abstract void updateTyre();
    abstract void service();

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
}
