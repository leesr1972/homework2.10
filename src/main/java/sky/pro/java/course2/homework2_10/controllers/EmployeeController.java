package sky.pro.java.course2.homework2_10.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sky.pro.java.course2.homework2_10.data.Employee;
import sky.pro.java.course2.homework2_10.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public String addNewEmployee(@RequestParam String lastName,
                                 @RequestParam String firstName,
                                 @RequestParam Float salary,
                                 @RequestParam Integer departmentId) {
        Employee newEmployee = employeeService.addEmployee(lastName, firstName, salary, departmentId);
        return "Новый сотрудник " + newEmployee.getLastName() + " " + newEmployee.getFirstName()
                + " принят на работу.";
    }

    @GetMapping("/remove")
    public String removeEmployee(@RequestParam String lastName, @RequestParam String firstName) {
        Employee disMissedEmployee = employeeService.dismissEmployee(lastName, firstName);
        return "Сотрудник " + disMissedEmployee.getLastName() + " " + disMissedEmployee.getFirstName()
                + " уволен.";
    }

    @GetMapping("/find")
    public String findStaff(@RequestParam String lastName, @RequestParam String firstName) {
        Employee employee = employeeService.findEmloyee(lastName, firstName);
        return "Сотрудник " + employee.getLastName() + " " + employee.getFirstName() + " найден.";
    }

    @GetMapping("/print")
    public String printAllStaff() {
        return employeeService.getAllStaff();
    }

    @GetMapping("/sumOfSalaries")
    public String sumOfSalaries() {
        return employeeService.calculateAllSalaries();
    }


}
