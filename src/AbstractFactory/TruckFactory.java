package AbstractFactory;

class TruckFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Truck(2500);
    }
}