package Chapter3;

public class Person <T>{
	// �� ����
	private int eye;
	// �� ����
	private int nose;
	// �� ����
	private int mouth;
	// �ĺ���
	private T id;
	
	private T tel;
	
	public Person(T tel) {
		this.tel = tel;
	}
	
	public void setTel(T tel) {
		this.tel = tel;
	}
	
	public void setID(T id) {
		this.id = id;
	}
	
	public T getID() {
		return id;
	}
	
}
