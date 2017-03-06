package AbstractFactory;

class Car implements Vehicle {
    private int x, y;
    private int topSpeed;
    public Car(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public void moveForwards() {
        x += topSpeed / 10;
    }

    @Override
    public java.lang.String toString() {
        return "Car{" +
                "x=" + x +
                ", y=" + y +
                ", topSpeed=" + topSpeed +
                '}';
    }
}