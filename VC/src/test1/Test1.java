package test1;

class ABC extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("hiiiiii");
			}
	}
}
public class Test1{

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.out.println("Hiiii1Pull");
		ABC t=new ABC();
		t.setName("Ram1");
		t.setPriority(10);
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("byeeeere");
			}
		
	}
	

}
