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

public class inher_interf {
    public static void main(String[] args) {
        
    }
}
