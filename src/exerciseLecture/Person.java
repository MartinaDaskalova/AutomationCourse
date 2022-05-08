package exerciseLecture;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.ToDoubleBiFunction;

public class Person {

    final String name;
    String sex;
    final String religion;
    final String languageSpoken;
    String job;
    final String nationality;
    final String EGN;
    final String dateOfBirth;
    final int age;
    String country;
    String fullEGN;

    public Person(String name, String religion, String languageSpoken, String job, String nationality, String age, String country) {
        this.name = name;
        this.sex = addSex();
        this.religion = religion;
        this.languageSpoken = languageSpoken;
        this.job = job;
        this.nationality = nationality;
        EGN = addEGN();
        dateOfBirth = addDoB();
        this.age = calculateAge();
        this.country = country;
    }

    /**
     * the method generates a user input EGN
     * @return String
     */
    public String addEGN(){
        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter 10 digit EGN: ");
        String input = myInput.nextLine();
        if(input.chars().count() != 10){
            throw new InputMismatchException("EGN must be exactly 10 digits! You've entered " + input.chars().count() + " digits");
        }
        fullEGN = input;
        return input;
    }

    public String addDoB(){
        String yearOfBirth = fullEGN.substring(0,2);
        String monthOfBirth = fullEGN.substring(2,4);
        String dayOfBirth = fullEGN.substring(4,6);
        String dateOfBirth = yearOfBirth + "." + monthOfBirth + "." + dayOfBirth;

        return dateOfBirth;

    }

    /**
     * Sex implementation
     * @return
     */

    public String addSex(){
        Scanner myInput = new Scanner(System.in);
        System.out.println("""
                Choose sex:\s
                 1. Male
                 2. Female""");
        int input = myInput.nextInt();
        if(input != 1 && input != 2){
            System.out.println("You've entered an invalid value");
            this.sex = "n/a";
        } else if (input == 1){
            sex = "Male";
        }else {
            sex = "Female";
        }
        return sex;
    }


    /**
     *  Age implementation
     * @return
     */

    public int calculateAge()
    {
        String yearOfBirth = fullEGN.substring(0,2);
        String monthOfBirth = fullEGN.substring(2,4);
        String dayOfBirth = fullEGN.substring(4,6);
        Integer.parseInt(yearOfBirth);
        yearOfBirth = Integer.toString(1900 + Integer.parseInt(yearOfBirth));
        String dateOfBirth = yearOfBirth + "-" + monthOfBirth + "-" + dayOfBirth;

        LocalDate.parse(dateOfBirth);
//creating an instance of the LocalDate class and invoking the now() method
//now() method obtains the current date from the system clock in the default time zone
        LocalDate curDate = LocalDate.now();
//calculates the amount of time between two dates and returns the years
        if ((dateOfBirth != null) && (curDate != null))
        {
            System.out.println("Your age is: " + Period.between(LocalDate.parse(dateOfBirth), curDate).getYears());
            return Period.between(LocalDate.parse(dateOfBirth), curDate).getYears();
        }
        else
        {
            return 0;
        }
    }




    public void sayHello() {
        System.out.println("Hello!");
    }

    public void celebrateEaster(){

    }

    public void isAdult(){

    }

    public void canTakeLoan() {
        if (this.job == null || this.job == "n/a"){
            System.out.println("You can't take a loan");
        }
        else
            System.out.println("You can take a loan");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", religion='" + religion + '\'' +
                ", languageSpoken='" + languageSpoken + '\'' +
                ", job='" + job + '\'' +
                ", nationality='" + nationality + '\'' +
                ", EGN='" + EGN + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", fullEGN='" + fullEGN + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Person person = new Person("Martina","christian","english","QA","Bulgarian","28","Bulgaria");

        person.calculateAge();
    }
}
