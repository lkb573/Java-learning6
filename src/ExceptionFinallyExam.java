
public class ExceptionFinallyExam {
    public static void main(String[] args){

        try {
            startInstall();
            copyFiles();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            delteTempFiles();
        }


    }

    static void startInstall(){
        System.out.println("Print Install");
    }

    static void copyFiles(){
        System.out.println("Print copy");
    }

    static void delteTempFiles() {
        System.out.println("Print delete");
    }
}