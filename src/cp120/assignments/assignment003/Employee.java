package cp120.assignments.assignment003;

public class Employee {
    String firstName;
    String lastName;
    static int NUM_OF_EMP=0;
    public static void main( String[] args ){
        Employee emp1 = new Employee("Kail", "Mehta");
        emp1.printEmployee();
        Employee emp2 = new Employee("Mathew", "Kora");
        emp2.printEmployee();
        Employee emp3 = new Employee("Noel", "Prince");
        emp3.printEmployee();

        System.out.printf( "\nTotal no of emplayee:  %d\n", NUM_OF_EMP );

    }

    Employee(String firstN,String lastN){
        firstName= firstN;
        lastName= lastN;
        setNumOfEmployees();
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName()  {
        return lastName;
    }

    public void setNumOfEmployees() {
        NUM_OF_EMP= NUM_OF_EMP+1 ;
    }

    public int getNumOfEmployees() {
        return NUM_OF_EMP;
    }

    public void printEmployee() {
        System.out.printf( "\n%3d Object: First Name: %2s. Last Name: %s.\n", getNumOfEmployees(), getFirstName(), getLastName()  ); ;
    }
}
