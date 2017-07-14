
class ThreadExam {
    public static void main(String[] args){

        ThreadExam_1 t1 = new ThreadExam_1();

        Runnable r = new ThreadExam_2();
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();
    }
}

class ThreadExam_1 extends Thread{
    public void run(){
        for (int i=0; i<5; i++){
            System.out.println(getName());
        }
    }
}

class ThreadExam_2 implements Runnable{
    public void run(){
        for (int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}