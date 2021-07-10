public class Main {
    public static void main(String[] args){

        DbConnection db = DbConnection.getInstance();
        db.execute();

        DbConnection db2 = DbConnection.getInstance();
        db2.execute();

    }

}
