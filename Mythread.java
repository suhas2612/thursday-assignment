package thread;

class MyThread extends Thread
{
	static String message[]= {"Java","is","hot",",","aromatic","and","invigorating."};
	public MyThread(String id)
	{
		super(id);
	}
	public void run()
	{
		String name=getName();
	
	for(int i=0;i<message.length;++i)
	{
		randomWait();
		System.out.println(name+message[i]);
	}
}
void randomWait()
{
	try
	{
		Thread.sleep((long)(1000*Math.random()));
	}
	catch(InterruptedException e)
	{
		System.out.println("Interrupted!");
	}
}
}

public class TestThread {

	public static void main(String[] args) {
		MyThread thread1=new MyThread("thread1: ");
		MyThread thread2=new MyThread("thread2: ");
         thread1.start();
         thread2.start();
        boolean thread1Isthere=true;
        boolean thread2IsAlive=true;
        do
        {
        	if(thread1Isthere && thread1.isAlive())
        	{
        		thread1Isthere=false;
        		System.out.println("Thread1 is dead");
        	}
        	if(thread2IsAlive && thread2.isAlive())
        	{
        		thread2IsAlive=false;
        		System.out.println("Thread2 is dead");
        	}
        }
        while(thread1Isthere|| thread2IsAlive);
        System.out.println("---------------------------");
	}

}


