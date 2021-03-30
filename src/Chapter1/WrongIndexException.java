package Chapter1;

public class WrongIndexException extends Exception {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -3593444296920253041L;

	// msg -> 예외가 왜 발생했는지, 사유임
	public WrongIndexException(String msg) {
		super(msg);
	}
}
