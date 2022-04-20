package constructorsandexceptions;

public class StackOverflow {
    public static void recursivePrint(int num) {
        System.out.println("Number: " + num);
        if (num == 0)
            return;
        else
            recursivePrint(++num);
    }
    public static void main(String[] args) {

        StackOverflow.recursivePrint(1);
        }
}
