package Interface;
interface bycycle{
void run(int increment);
void stop(int decrement);
}

class avon implements bycycle{

int speed=7;
 public void run(int increment){
    System.out.println("speed will be decreased");
 }
 public void stop(int decrement){
    System.out.println("Speed will be decreased");
 }

    
}
public class int1 {
    public static void main(String[] args) {
        avon a1 =new avon();
        a1.run(1);
    }
}
