import java.*;

public class HelloWorld
{
    public  static  Thread M;
    public  static  void  main(String args[])
    {
        M = Thread.currentThread();

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true)
                {
                    //Thread.sleep(1000);
                    try
                    {
                            System.out.println("i am running..........sdf色污染...");
                            Thread.sleep(1000);
                            System.out.println("m state is .........."+M.getState().toString());
                    }
                    catch ( java.lang.Exception e){ //java.lang.InterruptedException e){
                        //Thread.currentThread().isInterrupted();
                        //Thread.currentThread().interrupt();
                        //Thread.interrupted();
                        //System.out.println("i am"+Thread.currentThread().isInterrupted());
                    }
                }
            }
        }) ;
        t.start();
        t.interrupt();
        System.out.println("t Interrupted is "+t.isInterrupted());
        System.out.println("safdasfafdsfDS"+Thread.currentThread().getId());


        try
        {
            t.join(5000);
        }
        catch ( java.lang.InterruptedException e){
            System.out.println("i am"+Thread.currentThread().isInterrupted());
    }

    }
}