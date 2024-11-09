package August_Liveprograms.ex_18082024.Multithreading;

public class Thread04 {
    public static void main(String[] args) {
        Runnable w1=new WorkerTh_04();
        Thread t1=new Thread(w1);
        t1.start();
        // Where is the Start ?

        Runnable w2=new WorkerTh_04();
        Thread t2=new Thread(w2);
        t2.start();
    }

}
class WorkerTh_04 implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<=5;i++){
            try {
                System.out.println(i +" -->");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
