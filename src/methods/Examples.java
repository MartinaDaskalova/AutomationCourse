package methods;

public class Examples {

    static int myMethod(int x){

        return x-1;
    }

    static double myMethod(double x){
        return x-1;
    }

    static int plusMethod(int x, int y){
        return x+y;
    }
    static double plusMethod(double x, double y){
        return x + y;
    }


    public static void main(String[] args) {
        myMethod(4);

        Dog dog1 = new Dog("Cavalier King Charles Spaniel");


        MathOperators myMath = new MathOperators();

        myMath.setBankAccountBalance(-1);

        System.out.println(myMath.getBankAccountBalance());

    }
}
