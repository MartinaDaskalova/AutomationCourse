package constructorsandexceptions.homework;

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

    public Car(String name, int releaseYear, String color, boolean isSecondHand) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.color = color;
        this.isSecondHand = isSecondHand;
        horsePower = -1;
    }

    public Car(String name, String color, boolean isSecondHand) {
        this.name = name;
        this.color = color;
        this.isSecondHand = isSecondHand;
        horsePower = -1;
        releaseYear = -1;
    }

    public Car(String name, int releaseYear, String color, int horsePower) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.color = color;
        this.horsePower = horsePower;
        isSecondHand = false;
    }

    public Car(){
    name = "N/A";
    color = "N/A";
    releaseYear = -1;
    horsePower = -1;
    isSecondHand = false;
    }

    public static void main(String[] args) {

        Car carEmpty = new Car ();
        Car car1 = new Car("Peugeot 208",2020,75,false,"yellow");
        Car car2 = new Car("Nissan GTR","black",true);
        Car car3 = new Car("Mercedes s620",2022,"black",false);
        Car car4 = new Car("Honda Civic",2021,"white",240);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(carEmpty);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", releaseYear=" + releaseYear +
                ", color='" + color + '\'' +
                ", horsePower=" + horsePower +
                ", isSecondHand=" + isSecondHand +
                '}';
    }
}
