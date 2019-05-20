import java.io.*;

/**
 * FileStream
 */
public class FileStream {

    void characterSteamer () throws Exception{
        // FileWriter filew =  new FileWriter("streamer.txt");
        FileOutputStream filew =  new FileOutputStream("streamer.txt");
        
        filew.write("hehehehehe".getBytes());
        filew.close();
    }

    public static void main(String[] args) throws Exception {
        new FileStream().reader();
    }    

    void reader () throws Exception{
        // FileInputStream fileInputStream = new FileInputStream("streamer.txt");
        RandomAccessFile rFile = new RandomAccessFile(new File("streamer.txt"), "r");
        FileInputStream filer= new FileInputStream(rFile.getFD());
        System.out.println((char)filer.read());    

        rFile.seek(4);
        System.out.println((char)filer.read());    
        

    }
    
}