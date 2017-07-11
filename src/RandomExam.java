import java.util.Random;

public class RandomExam {
    public static void main(String[] args){

        Random ra = new Random(1);
        Random ra2 = new Random(1);

        System.out.println("-- Random --");
        for (int i=0; i<5; i++){
            System.out.println(i + " --> " + ra.nextInt());
        }

        System.out.println();
        System.out.println("-- Random2 --");
        for (int i=0; i<5; i++){
            System.out.println(i + " --> " + ra2.nextInt());
        }
    }
}