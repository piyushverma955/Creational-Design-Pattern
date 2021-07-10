public class Main {
    public static void main(String[] args){
        try {
            Staff s1 = new Staff();
            System.out.println(s1.getStaffNames());
            System.out.println(s1.hashCode());
            Staff s2 = (Staff) s1.clone();
            System.out.println(s2.getStaffNames());
            System.out.println(s2.hashCode());
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
