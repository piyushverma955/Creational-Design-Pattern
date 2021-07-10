package vehicle;

public class VehicleFactory {
    public static Vehicle getVehicle(String carBody, String vehicleType) throws Exception {
        switch (vehicleType) {
            case "Gas" : return GasVehicleFactory.getGasVehicle(carBody);
            case "Electric" : return ElectricVehicleFactory.getElectricVehicle(carBody);
            case "Hybrid" : return HybridVehicleFactory.getHybridVehicle(carBody);
            default: throw new Exception("not found");
        }
    }
}
