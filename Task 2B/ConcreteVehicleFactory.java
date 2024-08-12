public class ConcreteVehicleFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle(String vehicleType) {
        switch (vehicleType) {
            case "Car":
                return new Car();
            case "Bike":
                return new Bike();
            case "Scooter":
                return new Scooter();
            default:
                throw new IllegalArgumentException("Unknown vehicle type: " + vehicleType);
        }
    }
}
