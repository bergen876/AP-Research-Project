package johnShop;

public class Controller {
	
	ALLOrders win = ALLOrders.getInstance();
	   public static void main(String[] args) {
			Test1 gui = new Test1();
			gui.go();
			
		}
	public String getOrders() {
		// TODO Auto-generated method stub
		return win.readall();
	}
	   

}
