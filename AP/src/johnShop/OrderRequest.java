package johnShop;

import java.io.Serializable;

public class OrderRequest implements Serializable{
	 private int Ordernum;
	 private String Location;
	 private Students student;
	 private Snack snack;
	 private float TotalPrice;
	public int getOrdernum() {
		return Ordernum;
	}
	public void setOrdernum(int ordernum) {
		Ordernum = ordernum;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public Students getStudent() {
		return student;
	}
	public void setStudent(Students student) {
		this.student = student;
	}
	public Snack getSnack() {
		return snack;
	}
	public void setSnack(Snack snack) {
		this.snack = snack;
	}
	public float getTotalPrice() {
		return TotalPrice;
	}
	public void setTotalPrice(float totalPrice) {
		TotalPrice = totalPrice;
	}
	public OrderRequest(int ordernum, String location, Students student, Snack snack, float totalPrice) {
		super();
		Ordernum = ordernum;
		Location = location;
		this.student = student;
		this.snack = snack;
		TotalPrice = totalPrice;
	}
	public OrderRequest() {
		Ordernum=0;
		 Location= null;
		  student= new Students();
		  snack = new Snack();
		  TotalPrice=0;
		
	}
	


}
