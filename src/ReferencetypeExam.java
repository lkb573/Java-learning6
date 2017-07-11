class Data1 { int x; }

public class ReferencetypeExam {
    public static void main(String[] args){

        Data1 d1 = new Data1();
        d1.x = 10;
        System.out.println("main --> " + d1.x);

        change(d1);
        System.out.println("--After change--");
        System.out.println("main --> " + d1.x);
    }

    static void change(Data1 d){
        d.x = 1000;
        System.out.println("change --> " + d.x);
    }
}