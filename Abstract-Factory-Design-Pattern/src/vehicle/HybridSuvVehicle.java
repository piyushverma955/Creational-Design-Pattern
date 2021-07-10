package vehicle;

public class HybridSuvVehicle extends HybridVehicle {
    public HybridSuvVehicle(){
        super("SUV");
    }

    @Override
    public void greetDriver() {
        System.out.println("Greetings from Hybrid SUV");
    }
}
