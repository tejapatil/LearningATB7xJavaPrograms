package Oops_Exercise;

public class TapeDeck {

    boolean canRecord =false;

    void playTape(){
        System.out.println("tape playing");
    }

    void recordTape(){
        System.out.println("tape recording");
    }
}

class TakeDeckTestDrive{
    public static void main(String[] args) {
        TapeDeck t=new TapeDeck();
        t.canRecord =true;
        t.playTape();

        if(t.canRecord ==true){
            t.recordTape();
        }
    }
}
