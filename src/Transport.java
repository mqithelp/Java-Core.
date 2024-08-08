public abstract class Transport implements ToDoWell {
    private String modelName;
    private int wheelsCount;

    abstract void updateTyre();

    void changeWheels() {
        System.out.println("Обслуживаем " + this.getModelName() + ". Надо заменить "
                + this.getWheelsCount() + " покрышки.");

        for (int i = 0; i < this.getWheelsCount(); i++) {
            this.updateTyre();
        }
    }

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
