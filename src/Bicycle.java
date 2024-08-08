public class Bicycle extends Transport {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку на велосипеде.");
    }

    public void move() {
        System.out.println("Йо-хоо! Едет велосипедик!");
    }
    public void toDoWell() {
        changeWheels();
        move();
        System.out.println("Сделано всё супер хорошо! Класс Велик!");
    }
}
