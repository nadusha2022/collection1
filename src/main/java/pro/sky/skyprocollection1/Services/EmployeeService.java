package pro.sky.skyprocollection1.Services;


import pro.sky.skyprocollection1.Employee.Employee;

public interface EmployeeService {
    Employee addEmployee(String firstName, String lastName);
    Employee removeEmployee(String firstName, String lastName);
    Employee findEmployee(String firstName, String lastName);

}

