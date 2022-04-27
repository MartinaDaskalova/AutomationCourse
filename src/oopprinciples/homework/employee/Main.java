package oopprinciples.homework.employee;

public class Main
{
    public static void main(String[] args) {

        Employee Employee1 = new Employee(563,"Martina","Daskalova");

        System.out.println(Employee1.getName());


    }

    public String toString(){
        return""; // returns employee data
    }
}
