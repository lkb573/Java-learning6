
class ThreadPriorityExam {
    public static void main(String[] args){

        ThreadPriorityExam_1 th1 = new ThreadPriorityExam_1();
        ThreadPriorityExam_2 th2 = new ThreadPriorityExam_2();

        th2.setPriority(7);

        System.out.println("th1 (-) --> " + th1.getPriority());
        System.out.println("th2 (-) --> " + th2.getPriority());

        th1.start();
        th2.start();

    }
}

class ThreadPriorityExam_1 extends Thread{
    public void run(){
        for (int i=0; i<300; i++){
            System.out.print("-");
            for (int x=0; x<10000000; x++);
        }
    }
}

class ThreadPriorityExam_2 extends Thread{
    public void run(){
        for (int i=0; i<300; i++){
            System.out.print("|");
            for (int x=0; x<10000000; x++);
        }
    }
}