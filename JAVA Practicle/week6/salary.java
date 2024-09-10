package week6;

//Employee class to manage employee details
class Employee {
 private String name;
 private String role;

 public Employee(String name, String role) {
     this.name = name;
     this.role = role;
 }

 public String getName() {
     return name;
 }

 public String getRole() {
     return role;
 }
}

//SalaryCalculator class to handle salary calculation logic
class SalaryCalculator {
 public double calculateSalary(Employee employee) {
     double baseSalary = 30000; // base salary for all roles
     double roleMultiplier = getRoleMultiplier(employee.getRole());
     return baseSalary * roleMultiplier;
 }

 private double getRoleMultiplier(String role) {
     switch (role) {
         case "Manager":
             return 2.0;
         case "Developer":
             return 1.5;
         case "Intern":
             return 1.0;
         default:
             return 1.0; // default multiplier
     }
 }
}

public class salary {
 public static void main(String[] args) {
     // Creating instances of employees
     Employee employee1 = new Employee("Alice", "Manager");
     Employee employee2 = new Employee("Bob", "Developer");
     Employee employee3 = new Employee("Charlie", "Intern");

     // Creating an instance of SalaryCalculator
     SalaryCalculator salaryCalculator = new SalaryCalculator();

     // Calculating and displaying the salaries
     System.out.println(employee1.getName() + "'s salary: $" + salaryCalculator.calculateSalary(employee1));
     System.out.println(employee2.getName() + "'s salary: $" + salaryCalculator.calculateSalary(employee2));
     System.out.println(employee3.getName() + "'s salary: $" + salaryCalculator.calculateSalary(employee3));
 }
}
