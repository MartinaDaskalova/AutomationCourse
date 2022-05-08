package oopprinciples.homework.employee;

public class Employee {

    final int id;
    final String firstName;
    final String lastName;
    private double salary;


    public Employee(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String getName(){
        return firstName + ' ' + lastName;
    }

    public double getAnnualSalary() {
        return salary * 12;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double raisePercentage){
        double increase = (salary * raisePercentage)/100;
        this.salary += increase;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
