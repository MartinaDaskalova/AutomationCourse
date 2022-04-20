package constructorsandexceptions;

public class TryAndCatchExceptions {

    public static void throwIt(){

        System.out.println("throw it");
        throw new RuntimeException();
    }

    public static void notThrowIt(){
        throwIt();
    }


    public static void main(String[] args) {

        try {
            System.out.println("Hello");
            notThrowIt();
        }
        catch (ArithmeticException e){
            System.out.println("caught");
        }
        finally {
            System.out.println("finally");
        }
    }
}
