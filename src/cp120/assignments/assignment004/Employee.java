package cp120.assignments.assignment004;

public class Employee {
    private String empFirstName;
    private String empLastName;
    private String empPhoneNo;
    private String empEmail;

    Employee(String empFirstName, String empLastName, String empPhoneNo, String empEmail){
        this.empFirstName=empFirstName;
        this.empLastName=empLastName;
        this.empPhoneNo=empPhoneNo;
        this.empEmail=empEmail;
    }
    public String getEmpFirstName() {
        return empFirstName;
    }
    public String getEmpLastName() {
        return empLastName;
    }
    public String getEmpPhoneNo() {
        return empPhoneNo;
    }
    public String getEmpEmail() {
        return empEmail;
    }
}