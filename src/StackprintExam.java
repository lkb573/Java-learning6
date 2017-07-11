import java.util.Stack;

public class StackprintExam {
    public static void main(String[] args){

        Stack st = new Stack();

        st.push("0");
        st.push("1");
        st.push("2");
        st.push("3");
        st.push("4");

        System.out.println("--Stack--");
        while (!st.empty()){
            System.out.println(st.pop());
        }

    }
}