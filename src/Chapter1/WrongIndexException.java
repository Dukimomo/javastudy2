package Chapter1;

public class WrongIndexException extends Exception {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -3593444296920253041L;

	// msg -> ���ܰ� �� �߻��ߴ���, ������
	public WrongIndexException(String msg) {
		super(msg);
	}
}
