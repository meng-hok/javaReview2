import java.io.*;

/**
 * SubException
 * 1 . create class , raise error 3 catch (checked exception) 
 *
 */
public class SubException {

    public static void main(String[] args) {
        
        

    }

    //checked exception have to handle before compile
    void checked(){
        
        try {
            
            throw new CheckedException();
        } catch (CheckedException e) {
            e.printStackTrace();
        }

    }

    void unchecked(){

        throw new UnCheckedException();
    }
    
}


class UnCheckedException extends RuntimeException{

}

class CheckedException extends Exception {


}

