package constructorsandexceptions;

public class Car {

    private String name;
    private int releaseYear;
    private String color;
    private int horsePower;
    private boolean isSecondHand = false;

    public Car(String name, int releaseYear, int horsePower, boolean isSecondHand, String color) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        this.isSecondHand = isSecondHand;
        this.color = color;
    }

    public Car(String name, int releaseYear, String color, int horsePower) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.color = color;

    }

    public Car(String name, int releaseYear, String color) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.color = color;
        horsePower = -1;
    }

    public Car(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
        color = "N/A";
    }

    public Car(){

    }

    public static void main(String[] args) {

        Car car = new Car();
    }
}
