package test2;

class ABC implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//System.out.println("child "+Thread.currentThread().getName());
		System.out.println("child "+Thread.currentThread().getPriority());
		for(int i=0;i<10;i++) {
			System.out.println("hiiiiii");
			}
		
	}
	
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hiiii1234");
		ABC t1=new ABC();
		Thread t=new Thread(t1);
		//t.setName("Ram1");
		t.setPriority(10);
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("byeee");
			}
			//System.out.println("Main "+Thread.currentThread().getName());
			System.out.println("Main "+Thread.currentThread().getPriority());
			
	}

}
