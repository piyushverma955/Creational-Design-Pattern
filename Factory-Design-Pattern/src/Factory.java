import Pastry.Pastry;
import Pastry.Puff;
import Pastry.Baklava;
import Pastry.Flaky;
import Pastry.CinnamonRoll;

public class Factory {
    public  static Pastry getPastry( PastryType type) throws Exception {
        switch (type) {
            case Puff: return new Puff();
            case Baklava: return new Baklava();
            case Flaky: return new Flaky();
            case CinnamonRoll: return new CinnamonRoll();
            default: throw new Exception("not found");
        }
    }
}
