package Chapter4;

public class Passenger {
	private String name;
	private String tel;
	private String seat;
	
	public Passenger(String name, String tel, String seat) {
		this.name = name;
		this.tel = tel;
		this.seat = seat;
	}
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
		
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getSeat() {
		return seat;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}

}
