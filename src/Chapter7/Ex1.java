package Chapter7;

public class Ex1 {

	public static void main(String[] args) {
		Thread thread = new Thread(new MyThread());
		thread.start();
		// ��ȸ��
		thread = new Thread(new MyThread());
		thread.start();
	}

}
