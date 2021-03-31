package Chapter3;

public class Person <T>{
	// 눈 개수
	private int eye;
	// 코 개수
	private int nose;
	// 입 개수
	private int mouth;
	// 식별값
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
