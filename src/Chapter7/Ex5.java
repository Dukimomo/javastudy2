package Chapter7;

import javax.swing.JOptionPane;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new Thread(new MyThread4());
		
		thread.start();
		
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���");
		System.out.println("�Է��Ͻ� ����" + input + "�Դϴ�");
	}

}
