package johnShop;
import java.io.*;


public class Snack implements Serializable {
	private  int SnackId;
	private String Name;
	
	private float price;
	
	private String imageUrl;
	
	public Snack () {
		SnackId= 0;
		price=0;
		Name= "";
		imageUrl="";
		
	}
	public Snack(int snackId, String name, float price, String imageUrl) {
		super();
		SnackId = snackId;
		Name = name;
		this.price = price;
		this.imageUrl = imageUrl;
	}


	public int getSnackId() {
		return SnackId;
	}

	public void setSnackId(int snackId) {
		SnackId = snackId;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

}
