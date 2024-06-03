import java.util.ArrayList;
import java.util.List;

public class Employee {
    public final Integer empId;
    public String name;
    public ArrayList<String> phone;
    public Integer experience;

    public Employee(Integer empId, String name, String phone, Integer experience) {
        this.empId = empId;
        this.name = name;
        this.phone = new ArrayList<>(List.of(phone));
        this.experience = experience;
    }

    public void addAdditionalPhone(String newPhone) {
        this.phone.add(newPhone);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID " + empId +
                ", name '" + name + '\'' +
                ", phone " + phone +
                ", experience '" + experience +
                "'}";
    }
}