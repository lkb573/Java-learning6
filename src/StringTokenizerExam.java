import java.util.StringTokenizer;

public class StringTokenizerExam {
    public static void main(String[] args){

        String ex = "x=100*(200+300)/2";
        StringTokenizer st = new StringTokenizer(ex, "=+*()/", true);

        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

    }
}