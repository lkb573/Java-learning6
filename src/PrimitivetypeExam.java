class Data { int x; }

public class PrimitivetypeExam {
    public static void main(String[] args){

        Data d = new Data();
        d.x = 10;
        System.out.println("main --> " + d.x);

        change(d.x);
        System.out.println("--After change--");
        System.out.println("main --> " + d.x);
    }

    static void change(int x){
        x = 1000;
        System.out.println("change --> " + x);
    }
}