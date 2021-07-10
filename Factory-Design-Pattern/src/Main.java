import Pastry.Pastry;

public class Main {
    public static void main(String[] args){
        try {
            Pastry puff = Factory.getPastry(PastryType.Puff);
            System.out.println(puff.getFirstExpression());
            Pastry baklava = Factory.getPastry(PastryType.Baklava);
            System.out.println(baklava.getFirstExpression());
            Pastry flaky = Factory.getPastry(PastryType.Flaky);
            System.out.println(flaky.getFirstExpression());
            Pastry cinnamonRoll = Factory.getPastry(PastryType.CinnamonRoll);
            System.out.println(cinnamonRoll.getFirstExpression());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
