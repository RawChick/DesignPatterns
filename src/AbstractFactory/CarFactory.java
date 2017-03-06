package AbstractFactory;

class CarFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car(260);
    }
}