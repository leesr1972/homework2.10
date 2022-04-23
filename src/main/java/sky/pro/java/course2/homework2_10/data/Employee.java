package sky.pro.java.course2.homework2_10.data;

import java.util.Objects;

public class Employee {
    private String lastName;
    private String firstName;
    private Float salary;
    private Integer departmentId;

    public Employee(String lastName, String firstName, Float salary, Integer departmentId) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
        this.departmentId = departmentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Float.compare(employee.salary, salary) == 0 && departmentId == employee.departmentId && firstName.equals(employee.firstName) && lastName.equals(employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, salary, departmentId);
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + ", " + "отдел: " + getDepartmentId() +
                ", заработная плата - " + getSalary() + " руб.";
    }
}
