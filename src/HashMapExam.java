import java.util.HashMap;
import java.util.Scanner;

public class HashMapExam {
    public static void main(String[] args){

        HashMap map = new HashMap();
        map.put("check","1234");
        map.put("hash","1111");
        map.put("hash","1234");

        Scanner s = new Scanner(System.in);

        while(true){
            System.out.println("Input : Id & Password");
            System.out.print("Id --> ");
            String id = s.nextLine().trim();

            System.out.print("Password --> ");
            String ps = s.nextLine().trim();
            System.out.println();

            if(!map.containsKey(id)){
                System.out.println("Not Found ID!");
                continue;
            }
            else {
                if (!(map.get(id).equals(ps))){
                    System.out.println("Id & Password Not correct! reinput!");
                }
                else {
                    System.out.println("Log-in");
                    break;
                }

            }
        }


    }
}