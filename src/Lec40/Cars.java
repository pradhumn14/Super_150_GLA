package Lec40;

public class Cars {

    int price;
    int speed;
    String color;

    public Cars() {
        // TODO Auto-generated constructor stub
    }

    public Cars(int price, int speed, String color) {
        // TODO Auto-generated constructor stub
        this.price = price;
        this.speed = speed;
        this.color = color;
    }

    @Override
    public String toString() {
        return "P : " + this.price + " S: " + this.speed + " C:" + this.color;
    }

}
