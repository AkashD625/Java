package multithreadning;

     class name extends Thread{
    @Override
    public void run(){
   
        while (true) {
            System.err.println("Welcome to name");
            
        }
       
    }

}


class name1 extends Thread{
    @Override
    public void run(){
   
        while (true) {
            System.err.println("Welcome to name1");
            
        }
       
    }

}


 public class Multithreadning{
    public static void main(String[] args) {

        name t1=new name();
        name1 t2=new name1();


        t1.start();
        t2.start();
    }
}