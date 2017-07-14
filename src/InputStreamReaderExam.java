import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

class InputStreamReaderExam {
    public static void main(String[] args){
        String line = "";

        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            System.out.println("Using OS encoding --> " + isr.getEncoding());

            do {
                System.out.print("Input String --> ");
                line = br.readLine();
                System.out.println("Result --> " + line);
            } while (!line.equalsIgnoreCase("q"));
        } catch (IOException e) {   }
    }
}