// import java.io.Serializable;
import java.io.*;
import java.util.*;
import java.util.stream;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Person implements Serializable{
    int age = 5;
    int id = 7;

    Person () {

    }

    Person(int age ,int id){
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", id =" + id +
                '}'+'\n';
    }
}
/**
 * InnerPerson
 */
 class InnerPerson extends MengHongException{
    
    public static void main(String[] args){
        try{
            throw new MengHongException();
        }catch(MengHongException ex){
            ex.printStackTrace();
        }
       
    }
    
}

class MengHongException extends Exception{
   MengHongException(){
       super("hahahahha");
   }
}
class Hello extends MengHongException{
  
}