public class Spaceship implements ToDoWell {
    @Override
    public void toDoWell() {
        System.out.println("О! Космический Корабль!");
        cleanEngine();
    }
    private void cleanEngine(){
        System.out.println("Чистим сопла!");
    }
}
