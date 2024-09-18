package week9;

import java.util.*;

class Employee {
 private int id;
 private String name;
 private String department;
 private double salary;

 public Employee(int id, String name, String department, double salary) {
     this.id = id;
     this.name = name;
     this.department = department;
     this.salary = salary;
 }

 public int getId() {
     return id;
 }

 public String getName() {
     return name;
 }

 public String getDepartment() {
     return department;
 }

 public double getSalary() {
     return salary;
 }

 @Override
 public String toString() {
     return "Employee{id=" + id + ", name='" + name + "', department='" + department + "', salary=" + salary + "}";
 }
}

class SortBySalary implements Comparator<Employee> {
 @Override
 public int compare(Employee e1, Employee e2) {
     return Double.compare(e1.getSalary(), e2.getSalary());
 }
}

class SortByName implements Comparator<Employee> {
 @Override
 public int compare(Employee e1, Employee e2) {
     return e1.getName().compareTo(e2.getName());
 }
}

class SortByDepartment implements Comparator<Employee> {
 @Override
 public int compare(Employee e1, Employee e2) {
     return e1.getDepartment().compareTo(e2.getDepartment());
 }
}

public class EmployeeManager {
 public static void main(String[] args) {
	 
     List<Employee> employees = new ArrayList<>();
     employees.add(new Employee(1, "Alice", "HR", 60000));
     employees.add(new Employee(2, "Bob", "Engineering", 75000));
     employees.add(new Employee(3, "Charlie", "Marketing", 55000));
     employees.add(new Employee(4, "David", "Engineering", 80000));
     employees.add(new Employee(5, "Eve", "HR", 65000));

     System.out.println("Employees sorted by salary:");
     Collections.sort(employees, new SortBySalary());
     for (Employee e : employees) {
         System.out.println(e);
     }

     System.out.println("\nEmployees sorted by name:");
     Collections.sort(employees, new SortByName());
     for (Employee e : employees) {
         System.out.println(e);
     }

     System.out.println("\nEmployees sorted by department:");
     Collections.sort(employees, new SortByDepartment());
     for (Employee e : employees) {
         System.out.println(e);
     }
 }
}
