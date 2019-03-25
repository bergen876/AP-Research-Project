package johnShop;

import java.awt.List;
import java.sql.*;

import java.io.*;



public class ALLOrders extends FileData {
	
	
			
		
	private static ALLOrders  instance = null;
	
	
	FileOutputStream fout = null;
	ObjectOutputStream oos = null;
	
	private int x ;
	FileWriter filewriter;
	PrintWriter print;
	String newline = System.getProperty("line.separator");
	private  ALLOrders(int x) {
		
	 
			
		
		
	}
	public static ALLOrders getInstance() {
		if (instance==null) {
			instance = new ALLOrders(1);
			
		}
		return instance;
		
		
		
		
	}
	public void serializeOrder(OrderRequest order) {
		
		
		String ord = newline+"Student Name: "+order.getStudent().getName()+newline+"Student ID"+order.getStudent().getStudentID()+newline+"Location: "+order.getLocation()+newline+"----SNACK ORDER--"+newline+order.getSnack().getName()+newline+"Total Price:  "+order.getTotalPrice()+newline+"###################################################"+newline;
		
		try {
			
			 filewriter = new FileWriter("C:\\Users\\berge\\git\\AP\\order.txt",true);
			 print= new PrintWriter(filewriter);
			 print.print(ord);
			 print.print(newline);
			 
			 
			
	//		write("\n"+order.getStudent().getName()+"\n"+order.getLocation()+"\n"+order.getSnack().getName()+"\n"+order.getTotalPrice());
					
		}catch(IOException e) {
			e.printStackTrace();
			
		}catch(Exception r) {
			r.printStackTrace();
			
			
		}finally {
			
				try {
					filewriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			
			}
	
		public String  readall() {
		  String y;
		   String x="";
			FileReader read = null;
			
			
			try {
				read=  new FileReader("C:\\Users\\berge\\git\\AP\\order.txt");
				BufferedReader buff = new BufferedReader(read);
				 while((y=buff.readLine())!=null) {
					 x =x+newline+y;			
				}
				
				
			}catch(Exception xo) {
				xo.printStackTrace();
			}
			return x;
			
		
	}
	
	
	
	
	
}