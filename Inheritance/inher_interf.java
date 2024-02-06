package Inheritance;
// Inherritance of interface is possible 
/*  EX  -  Consider we have interface1 with 2 methods in it , and another interface2 down to it which should contain methods 
of interface1 and its own method at that time inheritance of interface in=s done.
 
  
 */

interface sample1{
    void meth1();
    void meth2();
}
//Inheritaing the interface(sample).
// if we want to write the above meths in the some class at that time we use implements keyword or else 
//it wil give an error.

interface sample2 extends sample1{
    void meth3();
    void meth4();

}
// add the class and implementing the above interfaces using the keyword and initializing their methods

class inheri_interf implements sample2{
    public void meth3(){
        System.out.println("Meth3");
    }
    public void meth4(){
        System.out.println("Meth4");
    }

    //if implement the sample2 then we should initialize the methods of interface sample1 becouse it is inherited in sample2
    public void meth1(){
        System.out.println("Meth1");
    }
    public void meth2(){
        System.out.println("Meth2");
    }
}

public class inher_interf {
    public static void main(String[] args) {
        inheri_interf re=new inheri_interf();
        re.meth1();
        re.meth2();
        re.meth3();
        re.meth4();
    }
}
