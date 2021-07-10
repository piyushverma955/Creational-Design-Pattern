package vehicle;

public class HybridVehicleFactory {
    public static Vehicle getHybridVehicle(String carBody) throws Exception {
        switch (carBody) {
            case "SEDAN" : return new HybridSedanVehicle();
            case "SUV" : return new HybridSuvVehicle();
            default: throw new Exception("not found");
        }
    }
}
