class Car{
    String color;
    String gearType;
    int door;

    Car(){
        this("Red","auto",4);
    }

    Car(String color){
        this(color, "auto", 4);
    }

    Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

public class ConstructorExam {
    public static void main(String[] args){
        Car c1 = new Car();
        Car c2 = new Car("Blue");

        System.out.println("c1 --> " + c1.color + " / " + c1.gearType + " / " + c1.door);
        System.out.println("c2 --> " + c2.color + " / " + c2.gearType + " / " + c2.door);
    }
}