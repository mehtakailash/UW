package cp120.assignments.assignment004;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//import cp120.assignments.assignment004.Company;
//import cp120.assignments.assignment004.Employee;
//import cp120.assignments.assignment004.EmployeeDetail;

public class Assignment003 {

    public static void main( String[] args ){

        String csvFileToRead = "data/employee.csv";
        BufferedReader br = null;
        String line = "";
        String splitBy = ",";
        List<EmployeeDetail> empList = new ArrayList<EmployeeDetail>();


        try {

            br = new BufferedReader(new FileReader(csvFileToRead));
            while ((line = br.readLine()) != null) {

                // split on comma(',')
                String[] empData = line.split(splitBy);

                // create car object to store values
                Employee emp = new Employee(empData[0], empData[1],empData[8], empData[10] );
                Company comp = new Company(empData[2], empData[3], empData[4], empData[5], empData[6], empData[7], empData[9], empData[11]);
                EmployeeDetail empDetail = new EmployeeDetail(emp, comp);
                empList.add(empDetail);

            }
            // print values stored in carList
            printEmpList(empList);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void printEmpList(List<EmployeeDetail> empList) {
        for (EmployeeDetail emp: empList){
            System.out.println("==============================================");
            System.out.println(emp.getEmployee().getEmpFirstName() + " "
                    + emp.getEmployee().getEmpLastName() + "\n" + "\t"
                    + emp.getCompany().getCompName() + "\n" + "\t"
                    + emp.getCompany().getCompStreetAddress() + "\n" + "\t"
                    + emp.getCompany().getCompCitys() + ", "
                    + emp.getCompany().getCompState() + " "
                    + emp.getCompany().getCompZipcode() + "\n" + "\t"
                    + emp.getCompany().getCompWebsite());
        }
    }

}