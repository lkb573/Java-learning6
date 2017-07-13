class Tv{
    String color;
    boolean power;
    int cha;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public int getCha() {
        return cha;
    }

    public void setCha(int cha) {
        this.cha = cha;
    }
}

public class EncapsulationExam {
    public static void main(String[] args){

        Tv t1 = new Tv();
        Tv t2 = new Tv();

        System.out.println("t1 --> " + t1.cha);
        System.out.println("t2 --> " + t2.cha);

        t2 = t1;

        t1.cha = 7;
        System.out.println("-- t1 --> 7 --");

        System.out.println("t1 --> " + t1.cha);
        System.out.println("t2 --> " + t2.cha);
    }
}