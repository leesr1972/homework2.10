package sky.pro.java.course2.homework2_10.service;

public interface DepartmentService {
    String maxSalaryofDepartment(Integer departmentId);
    String minSalaryofDepartment(Integer departmentId);
    String printStaffOfDepartment(Integer departmentId);
    String printAllStaff();
}
