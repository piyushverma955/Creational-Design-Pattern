import vehicle.Vehicle;
import vehicle.VehicleFactory;

public class Main {
    public static void main(String[] args) throws Exception {
        Vehicle vh1 = VehicleFactory.getVehicle("SUV", "Gas");
        vh1.drive();
        vh1.fillUp();
        vh1.greetDriver();

        Vehicle vh2 = VehicleFactory.getVehicle("SEDAN", "Hybrid");
        vh2.drive();
        vh2.fillUp();
        vh2.greetDriver();

        Vehicle vh3 = VehicleFactory.getVehicle("SEDAN", "Electric");
        vh3.drive();
        vh3.fillUp();
        vh3.greetDriver();
    }
}
