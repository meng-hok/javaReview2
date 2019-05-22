import java.io.*;
import java.util.stream.Stream;

/**
 * ThreadTester
 */
public class ThreadTester {

}

class SubThread extends Thread {

    boolean boo = true;

    SubThread() {

    }

    SubThread(Boolean boo) {
        this.boo = boo;
    }

    synchronized void tester() {
        System.out.println("first");
        // try {
        // sleep(2000);
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }
        System.out.println("hehehe");
        System.out.println("hehehe");
        System.out.println("hehehe");
        System.out.println("hehehe");
    }

    synchronized static void statester() {
        System.out.println("first");
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hehehe");
        System.out.println("hehehe");
        System.out.println("hehehe");
        System.out.println("hehehe");
        System.out.println("hehehe");
    }

    void methodTester() {
        synchronized (this) {
            System.out.println("welcome to scope");
            try {
                this.wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("end-scope");
        }
    }

    void notSyn(){
        for (int i = 0; i < 20; i++) {
            System.out.println(i+"hehhee");
            try{
                sleep(1000);
            }catch(InterruptedException ir){
                
            }
        }
    }

    @Override
    public void run() {
       if(this.boo == true ){
           methodTester();
       }else{
           notSyn();
       }
    }


}

/**
 * InnerThreadTester
 */
 class InnerThreadTester {

    public static void main(String[] args) {
        SubThread subThread = new SubThread(false);
        subThread.start();
        new SubThread(false).start();
        new SubThread(false).start();
        new SubThread(false).start();
        new SubThread().start();
        
    }
}