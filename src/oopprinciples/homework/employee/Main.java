package oopprinciples.homework.employee;

public class Main
{
    public static void main(String[] args) {

        Employee Employee1 = new Employee(563,"Martina","Daskalova");
        Employee1.setSalary(2500);
        System.out.println(Employee1.getSalary());
        System.out.println(Employee1.getAnnualSalary());
        Employee1.raiseSalary(5);
        System.out.println(Employee1.getSalary());
        System.out.println(Employee1.getAnnualSalary());

       System.out.println(Employee1);


    }


    }


