import java.util.ArrayList;
import java.util.List;

public class Staff  implements  Cloneable{
    private List<String> staffNames;

    public Staff() {
        this.staffNames = new ArrayList<>();
        loadStaff();
    }

    private void loadStaff() {
        this.staffNames.add("Piyush");
        this.staffNames.add("Akash");
        this.staffNames.add("Nishant");
        this.staffNames.add("Sumana");
        this.staffNames.add("Raghu");
    }

    public List<String> getStaffNames() {
        return this.staffNames;
    }

    public String getByName(String name){
        return this.staffNames.stream().filter(x-> x.equalsIgnoreCase(name)).findFirst().orElse(null);
    }

    @Override
    public Object clone () throws  CloneNotSupportedException{
        Staff staff = (Staff) super.clone();
        return staff;
    }


}
