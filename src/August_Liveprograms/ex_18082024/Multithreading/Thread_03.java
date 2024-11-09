package August_Liveprograms.ex_18082024.Multithreading;

public class Thread_03 {
    public static void main(String[] args) {
        Worker worker=new Worker();
        worker.start();
        // Where is the Start ?

        Worker worker2=new Worker();
        worker2.start();
    }

}
class Worker extends Thread{
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