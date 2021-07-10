package vehicle;

public class HybridSedanVehicle extends HybridVehicle{
    public HybridSedanVehicle(){
        super("SEDAN");
    }

    @Override
    public void greetDriver() {
        System.out.println("Greetings from Hybrid Sedan");
    }
}
