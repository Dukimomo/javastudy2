package Chapter1;

// ������ ���� Ŭ������ ����
// MyException ArrayIndexOutofBoundsException ��� ������ ���ܰ� �ȴ�.
public class MyException extends RuntimeException {
	// ����ȭ
	private static final long serialVersionUID = 8846740554887192156L;

	// msg -> ���ܰ� �� �߻��ߴ���, ������
	public MyException(String msg) {
		super(msg);
	}
}
