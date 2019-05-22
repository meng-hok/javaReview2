import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 * SubException
 * 1 . create class , raise error 3 catch (checked exception) 
 *
 */
public class SubException {

    public static void main(String[] args) {

        //  Path file = Paths.get("/home/Desktop/SecondReview$/test.txt");
        File file = new File ("tesEt.txt");
        // Path file = Paths.get("test.txt");
        // System.out.println(file.get);
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.isAbsolute());
        System.out.println(file.exists());
        
        // try {
        //     // File.createTempFile("prefix", "suffix");
        //     sy
        // } catch (IOException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }finally
        // {
        //     System.out.println("hehehehe");
        // }
        // file.

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

