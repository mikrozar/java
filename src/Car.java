public class Car {
    String marka;
    int horsePower;
    boolean isAwd;
    float acceleration;

    void start() {
        System.out.println(marka + " Wrrrrr");
    }

    void setAcceleration (float acceleration) {
        this.acceleration = acceleration;
        System.out.println(marka + " разгоняется до 100 км/час за " + this.acceleration + " секунд");
    }

    public Car(String marka, int horsePower, boolean isAwd, float acceleration) {
        this.marka = marka;
        this.horsePower = horsePower;
        this.isAwd = isAwd;
        this.acceleration = acceleration;
        System.out.println("My car is " + this.marka);
    }

    public Car() {
        this("Mazda", 198, false, 10);
    }

    public Car (String marka) {
        this.marka = marka;
        System.out.println("My car is " + this.marka);
    }

    public float carSpeed (float time) {
        return (100/acceleration)*time;
    }
}
