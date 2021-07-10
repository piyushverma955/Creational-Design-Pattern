public class Main {

    public  static  void main(String[] args){
        Car car = new Car.Builder(2001, "Audi", "X20").setColor("blue").build();
        System.out.println(car.toString());

        Car car2 = new Car.Builder(2001, "Audi", "X20").setColor("red").setTrim("trim").build();
        System.out.println(car2.toString());
    }
}
