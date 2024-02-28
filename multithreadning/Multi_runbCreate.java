package multithreadning;
class Myrunablethread implements runable{
    public void run(){
        System.out.println("WElcome");
    }
    
}
class Myrunablethread2 implements runable{
    public void run(){
        System.out.println("Stopin");
    }
}


public class Multi_runbCreate {
public static void main(String[] args) {
    Myrunablethread b1 = new Myrunablethread();
    Thread g1 = new Thread(b1);

    Myrunablethread2 b2 = new Myrunablethread2();
    Thread g2 = new Thread(b2);


    g1.start();
    g2.start();
}    
}
