package Chapter1;

public class Ex2 {
	static double div(int val1, int val2) {
		try {
			double result = val1 / val2;
			
			return val1 / val2;
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			
			return 0;
		}	
	}
	
	static int readArrayElement(int index) {
		// WrongIndexException ���ܴ� �޼��� ���ο��� ó���� �ϰ�
		// ArrayIndexOutOfBoundsException ���ܴ� �޼��带 ȣ�����ʿ��� ó���ϵ����ϼ���
		
		try {
			int array[] = {9, 8, 7};
			
			if(index < 0) {
				throw new WrongIndexException("�ε����� 0 �Ǵ� ���� ������ ����");
			}
		
			return array[index];
		} catch(WrongIndexException e) {
			System.out.println(e.getMessage());
			
			return 0;
		
		}
		 catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			
			return 0;
		}
	}
	static void makeException() throws MyException{
		System.out.println("makeException ����");
		
		if(turn) {
			throw new MyException("���� ���� ���� �߻�");
		}
	}

	public static void main(String[] args) {
		double result1 = div(10, 0);
		System.out.println(result1);
		
//		try {
//			int result2 = readArrayElement(3);
//			System.out.println(result2);
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
//		}
//
//		try {
//			makeException();
//		} catch(MyException e) {
//			System.out.println("makeException �޼��尡 ���ܸ� ����");
//		}
		// readArrayElement�� ���ܸ� �����µ� ó��
		int result2 = readArrayElement(3);
		System.out.println(result2);
		
		// makeException�� ���ܸ� �����µ� ó������ �ʾҴ��� ������ ������ �߻��ϰ� ����
		makeException(false);
	}
}
