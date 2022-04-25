package activities;

public class Activity1 {

    public static void main(String[] args){
        Car volvo = new Car();

        volvo.make = 2019;
        volvo.color = "Black";
        volvo.transmission= "AMT";

        volvo.displayCharacteristics();
        volvo.accelerate();
        volvo.brake();

    }
}
