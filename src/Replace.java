public interface Replace {
    void updateTyre();

    default void notUpdateTyre() {
        System.out.println("Нельзя заменить покрцшку.");
    }
}
