package vehicle;

public class GasSedanVehicle extends GasVehicle{
    public GasSedanVehicle(){
        super("SEDAN");
    }

    @Override
    public void greetDriver() {
        System.out.println("Greetings from Gas Sedan");
    }
}
