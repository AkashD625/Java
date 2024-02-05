
package Abstractc_and_abs_meth;

abstract class first{
    public void prin1(){
 System.out.println("First sen of abs class");
}

abstract public void greet();
}
//concrete sub class
class sub2 extends first{
    @Override
    public void greet(){
        System.out.println("sen 1 of sub2 class");
    }
}

 abstract class sub3 extends first{
 public void las(){
System.out.println("3rd of extended of first");
 }


}

public class abs1 {
    public static void main(String[] args) {
        //should not crea
    }
    
}
