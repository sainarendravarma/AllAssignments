import java.util.ArrayList;
import java.util.List;


public class Program4_jdbc{
    public static void main(String[] args) {
        List<EmployeeData> employeeList = new ArrayList<>();

        
        EmployeeData employee1 = new EmployeeData(1, "Varma");
        employee1.addSalaryData(new SalaryData(2022, 7000));
        employee1.addSalaryData(new SalaryData(2021, 35000));
        employee1.addSalaryData(new SalaryData(2020, 35000));
        employeeList.add(employee1);
       
        EmployeeData employee2 = new EmployeeData(2, "Dharma");
        employee2.addSalaryData(new SalaryData(2022, 85000));
        employee2.addSalaryData(new SalaryData(2021, 87000));
        employee2.addSalaryData(new SalaryData(2020, 57000));
        employeeList.add(employee2);
        
        for (EmployeeData employee : employeeList) {
            System.out.println(employee);
        }
    }
}

