public class DbConnection {
    private static volatile DbConnection instance;

    private DbConnection(){}

    public static DbConnection getInstance() {
        if(instance == null){
            synchronized (DbConnection.class) {
                System.out.println("Instance is getting created !!");
                instance = new DbConnection();
            }
        }
        else  System.out.println("Instance is already created !!");
        return instance;
    }

    public void execute (){
        System.out.println("Crud operation executed successfully !!");
    }
}
