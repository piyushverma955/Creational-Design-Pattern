package vehicle;

public class GasVehicleFactory {
    public static Vehicle getGasVehicle(String carBody) throws Exception {
        switch (carBody) {
            case "SEDAN" : return new GasSedanVehicle();
            case "SUV" : return new GasSuvVehicle();
            default: throw new Exception("not found");
        }
    }
}
