class MultiThreading extends Thread{

    private int threadNumber;

    MultiThreading(int threadNumber){
        this.threadNumber=threadNumber;
    }
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println(i+" Thread "+threadNumber);
            if(threadNumber==1)
            throw new RuntimeException();
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){

            }
            
        }
    }
}

class ThreadingWithRunnable implements Runnable{
    public void run(){
        for(int i=5;i<=10;i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){

            }
        }
    }
}
public class Main{
    public static void main(String[] args) {

        for(int i=0;i<3;i++){
            MultiThreading m = new MultiThreading(i);
            
            m.start();
            ThreadingWithRunnable tr = new ThreadingWithRunnable();
            Thread t = new Thread(tr);
            t.start();
        }
        
       
    }
}