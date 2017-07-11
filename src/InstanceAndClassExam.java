
public class InstanceAndClassExam {
    public static void main(String[] args){

        System.out.println("card width --> " + Card.width);
        System.out.println("card height --> " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.num = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.num = 10;

        System.out.println(
                "c1 -> " + c1.kind + "/" + c1.num + "/" + c1.width + "/" + c1.height);
        System.out.println(
                "c2 -> " + c2.kind + "/" +  c2.num + "/" + c2.width + "/" + c2.height);

        c1.width = 80;
        c1.height = 120;

        System.out.println(
                "c1 -> " + c1.kind + "/" + c1.num + "/" + c1.width + "/" + c1.height);
        System.out.println(
                "c2 -> " + c2.kind + "/" + c2.num + "/" + c2.width + "/" + c2.height);
    }
}

class Card{
    String kind;
    int num;

    static int width = 100;
    static int height = 250;
}