package johnShop;

public class FileFactory {
	
	
	
	
	public FileData getFILE(String Type) {
		childFile x = new  childFile();
		
		if (Type.equals("write") ) {

			ALLOrders win  =  ALLOrders.getInstance();
			 
			 return win;
			 
			 
		}else {
			return new  childFile();
			
		}
		
	}

}


class Fileopen {
	
	
	
	
	
	
	
}

