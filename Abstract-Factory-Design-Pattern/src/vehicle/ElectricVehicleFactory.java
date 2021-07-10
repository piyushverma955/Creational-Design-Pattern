package vehicle;

public class ElectricVehicleFactory {
    public static Vehicle getElectricVehicle(String carBody) throws Exception {
        switch (carBody) {
            case "SEDAN" : return new ElectricSedanVehicle();
            case "SUV" : return new ElectricSuvVehicle();
            default: throw new Exception("not found");
        }
    }
}
