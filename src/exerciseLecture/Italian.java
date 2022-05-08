package exerciseLecture;

public class Italian extends Person{

    public Italian(String name, String religion, String languageSpoken, String job, String nationality, String age, String country) {
        super(name, religion, languageSpoken, job, nationality, age, country);
    }

    @Override
    public void sayHello() {
        System.out.println("Ciao!");
    }

    @Override
    public void celebrateEaster() {
        if ( this.religion == "Christian" || this.religion == "Orthodox"){
            System.out.println("I celebrate Easter.");
        } else System.out.println("I don't celebrate Easter");
    }



    @Override
    public void isAdult() {
        if(this.age < 18){
            System.out.println("You are not an adult.");
        }
        else
            System.out.println("You are an adult.");

    }

    @Override
    public void canTakeLoan() {
        super.canTakeLoan();
    }
}
