
public class ExceptionExam {
    public static void main(String[] args){

        try {
            Exception e = new Exception("고의로 발생");
            throw e;
            /*throw new Exception("고의로 발생");*/
        }catch (Exception e){
            System.out.println("Error Msg --> " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Exit!");

    }
}