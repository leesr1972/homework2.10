package sky.pro.java.course2.homework2_10.service;

import sky.pro.java.course2.homework2_10.data.Employee;

public interface EmployeeService {
    public Employee addEmployee (String lastName, String firstName, Float salary, Integer departmentId);
    public Employee dismissEmployee (String firstName, String lastName);
    public Employee findEmloyee (String firstName, String lastName);
    public String getAllStaff();
    String calculateAllSalaries();

}
