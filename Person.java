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
 class InnerPerson {
 
    public static void main(String[] args) {
        // System.out.println("hahaha");
        ArrayList<String> arr = new ArrayList();
        for (int i = 0; i < 10; i++) {
            arr.add("num:"+i);
        }

        System.out.println(arr);

        // Stream ster = arr.stream();

        // arr.forEach(action);
        
        arr.stream().filter(value -> value != "num:5").map(x ->  x+"hahahah").forEach(data -> {
            System.out.println(data);
        });;

        System.out.println(arr);
    }
    
}