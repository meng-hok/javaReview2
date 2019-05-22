// import java.*;
// import java.io.File;
// import java.io.ObjectOutputStream;
//  import java.nio.file.*;
import java.io.*;
import java.nio.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Base64;

class fileio{
    void pathtest() {

        File file = new File("home\\Desktop\\SecondReview\\text.txt");
        
         Path path = Paths.get(file.toPath().toString());
         System.out.println(path.getParent());
        System.out.println("hahaha");
        System.out.println(file.toPath());
    }

    public static void main(String[] args) throws Exception{
        subThread.baser();
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

    // void dbTester() throws ClassNotFoundException {

    //     Class.forName(" className ");
        
    //     String url = "";

    //     Connection connection = DriverManager.getConnection(URL," "," ");

    //     PreparedStatement prep = connection.preparedStatement("select * from table");

    //     ResultSet res = prep.executeUpdate();

    //     while(res.next()){
    //         System.out.println(res.next());
    //     }
        
    //     connection.close();
    // }

}

class subThread implements Runnable {

    public void run(){
        System.out.println();
    }
    
    public void name() {
        throw new subException();
    }

    public static void baser(){
       String str =  Base64.getEncoder().encodeToString("hello".getBytes());
       System.out.println(str);
    }

    public static void dater() {
        FileReader fileReader = new FileReader("test.txt");
        fileReader.read
        System.out.println();
        
    }
 }

 class subException extends RuntimeException { 
    
 }