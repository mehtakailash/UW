package cp120.assignments.assignment004;

public class EmployeeDetail {
    private Employee employee;
    private Company company;

    public Employee getEmployee() {
        return employee;
    }

    public Company getCompany() {
        return company;
    }

    public EmployeeDetail(Employee employee, Company company){

        this.employee=employee;
        this.company=company;
    }

}