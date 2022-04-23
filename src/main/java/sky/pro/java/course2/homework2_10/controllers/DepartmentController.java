package sky.pro.java.course2.homework2_10.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sky.pro.java.course2.homework2_10.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/max-salary")
    public String employeeWitnMaxSalary(@RequestParam Integer departmentId) {
        return departmentService.maxSalaryofDepartment(departmentId);
    }

    @GetMapping("/min-salary")
    public String employeeWitnMinSalary(@RequestParam Integer departmentId) {
        return departmentService.minSalaryofDepartment(departmentId);
    }

    @GetMapping("/all")
    public String printStaffOfDepartment(@RequestParam Integer departmentId) {
        return departmentService.printStaffOfDepartment(departmentId);
    }

    @GetMapping("/allPrint")
    public String printAllStaffbyDepartments() {
        return departmentService.printAllStaff();
    }
}
