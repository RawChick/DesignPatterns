package AbstractFactory;

class Main {
    public static void main(String[] args) {
        VehicleType chosenType = VehicleType.Car;
        VehicleFactory factory = null;
        switch(chosenType) {
            //default:
            case Car:
                factory = new CarFactory();
                break;
            case Truck:
                factory = new TruckFactory();
                break;
        }

        Vehicle vehicle = factory.createVehicle();
        vehicle.moveForwards();

        System.out.println(vehicle.toString());
    }
}

enum VehicleType {
    Car, Truck
}