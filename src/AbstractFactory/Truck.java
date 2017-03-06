package AbstractFactory;

class Truck implements Vehicle {
    private int x, y;
    private int cargoWeight;
    private final int MAX_WEIGHT = 10000;

    public Truck(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    @Override
    public void moveForwards() {
        if(cargoWeight < MAX_WEIGHT) {
            x += 5;
        }
    }

    @Override
    public java.lang.String toString() {
        return "Truck{" +
                "x=" + x +
                ", y=" + y +
                ", cargoWeight=" + cargoWeight +
                ", MAX_WEIGHT=" + MAX_WEIGHT +
                '}';
    }
}