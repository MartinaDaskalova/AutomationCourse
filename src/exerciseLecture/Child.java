package exerciseLecture;

public class Child extends Person{

    public Child(String name, String religion, String languageSpoken, String job, String nationality, String age, String country) {
        super(name, religion, languageSpoken, job, nationality, age, country);
    }

    @Override
    public void sayHello() {
        System.out.println("Hello!");
    }

    @Override
    public void celebrateEaster() {
        if ( this.religion == "Christian" || this.religion == "Orthodox"){
            System.out.println("I celebrate Easter.");
        } else System.out.println("I don't celebrate Easter");
    }


    @Override
    public void isAdult() {
        System.out.println("You are not an adult.");
    }

}
