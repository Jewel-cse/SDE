package Polymorphism;

import java.io.EOFException;
import java.io.IOException;

public class Child extends Parent {
    public static String methodOne()  throws ArithmeticException,NullPointerException{  //has also parent object return type 
        return null;
    }

    public static void main(String[] args) throws IOException {
        Parent p = new Child();
        p.methodOne();
    }
    
    
    

    /*
     * 
     //Covariant return type: 
         Parent          child
         Object    ->   string
         Number     ->    Integer

     */
        
        
}
