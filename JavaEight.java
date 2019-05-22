import java.io.*;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

/**
 * JavaEight
 */
@FunctionalInterface
interface Sayable {
    void say();
} 

public class JavaEight {
    /* */
    JavaEight(){
        System.out.println("hello world");
    }

    

    /*how if without method reference and lamda  */
    void normalInstance(){
        Sayable sayable = new Sayable(){
        
            @Override
            public void say() {
                System.out.println("hello world");
            }
        };

        sayable.say();
    }
    
    /* method reference */
    void methodRef(){
        Sayable refToConstructor = JavaEight::new;
        refToConstructor.say();

        JavaEight javaEight = new JavaEight();
        // reference to method
        Sayable refToMethod = javaEight::greeting;
        refToMethod.say();
        
        // reference to static method
        Sayable refToStatic = JavaEight::staticer;
        refToStatic.say();
    }

    /* lamda expression */
    void lamdar(){
        Sayable sayable = () -> {
            System.out.println("hello world ");
        };

        sayable.say();
    }

    /**static */
    static void staticer( ) {
        System.out.println("welcome");
    }

    void greeting (){
        System.out.println("hello world");
    }
    static void dater(){
        Period per = Period.between(LocalDate.of(2018,5,22),LocalDate.now());
        System.out.println(per);
        Duration thirtyDay = Duration.ofDays(30);
        System.out.println(thirtyDay);
    }
    
    public static void main(String[] args) {
        // JavaEight.dater();
     

    }
}

