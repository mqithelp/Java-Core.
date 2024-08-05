public interface Replace {
    void updateTyre();
    String getTransportName();
    int getTransportWheelsCount();

    default void notUpdateTyre() {
        System.out.println("Нельзя заменить покрцшку.");
    }
}
