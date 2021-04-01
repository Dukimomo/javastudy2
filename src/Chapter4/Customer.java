package Chapter4;

public class Customer {
	private String tel;
	private String paymentMethod;
	
	public Customer(String tel, String paymentMethod) {
		this.tel = tel;
		this.paymentMethod = paymentMethod;
	}
	
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPay(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
}
