public class Employee {
    private int id;
    private String firstName;
    private String lastName;

    public String getFullName(){
        return firstName + "-" + lastName;
    }
}
