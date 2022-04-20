package oopprinciples;

public class ClassExample {

    int x ;


    public static void printHello(){
        System.out.println("This method can be called without creating an object of class ClassExample");
    }

    public void printHelloOfObject(){
        System.out.println("This method can be called only if you create an object of class ClassExample");
    }

    public static void main(String[] args) {

        ClassExample myObject = new ClassExample();
        myObject.x = 30;

        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myDog = new Dog();

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();

        System.out.println(myPig.maxAge);

    }
}
