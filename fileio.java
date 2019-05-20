// import java.*;
// import java.io.File;
// import java.io.ObjectOutputStream;
//  import java.nio.file.*;
import java.io.*;
import java.nio.*;
import java.nio.file.Path;
import java.nio.file.Paths;

class fileio{
    void pathtest() {

        File file = new File("home\\Desktop\\SecondReview\\text.txt");
        
         Path path = Paths.get(file.toPath().toString());
         System.out.println(path.getParent());
        System.out.println("hahaha");
        System.out.println(file.toPath());
    }

    public static void main(String[] args) throws Exception{
        new fileio().pathtest();
    }

    void serializatester() throws Exception{
        int i = 0;
        ObjectOutputStream outputter =  new ObjectOutputStream(new FileOutputStream("text.txt"));
           
        while(i<10){
            
            outputter.writeObject(new Person());
            i++;

        }
        System.out.println("done");
    }

    void deserializatester() throws Exception{
        // Person person = (Person) new ObjectInputStream(new FileInputStream("text.txt")).readObject();
        ObjectInputStream inputter =  new ObjectInputStream(new FileInputStream("text.txt"));
        
        for (int i = 0; i < 15; i++) {
           try{
            Person person = (Person) inputter.readObject();
            System.out.println(person);
           }catch(Exception ex ){
             break;
           }
        }

        
        
    }
}