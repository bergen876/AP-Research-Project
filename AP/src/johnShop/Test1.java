package johnShop;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.io.*;




public class Test1 extends JFrame implements ActionListener {
	
	 
	JFrame frame;
	JFrame frame2;
	//JEditorPane JohnSnack = new JEditorPane();
	OrderRequest   Order = new OrderRequest();
	JLabel Labe1 = new JLabel("Name:");
	JLabel Labe2 = new JLabel("ID:");
	JLabel Labe3 = new JLabel("Location:");
	JLabel Labe5 = new JLabel("Pasword");
	JLabel Labe4 = new JLabel("Username");
	JLabel Labe6 = new JLabel("Total Price");
	JLabel  StuffOrdered= new JLabel("ITEMS ORDERED");
	
	//Declaring aLL Panels and assigning Background Color
	ImagePanel panel1 = new ImagePanel(new ImageIcon("background3.png").getImage());
	ImagePanel panel2 = new ImagePanel(new ImageIcon("background3.png").getImage());
	ImagePanel panel3 = new ImagePanel(new ImageIcon("background3.png").getImage());
			
	JTextField field4 = new JTextField(1);
	JTextField field5 = new JTextField(1);
	JTextField field = new JTextField(1);// name
	IntegerField field1 = new IntegerField();//id
	JTextField field3 = new JTextField(2);//location
	JTextField field6 = new JTextField(1);// Total Price
	Icon Snacky = new ImageIcon("Snack.png");
	Icon SubmitIco = new ImageIcon("sub.png");
	Icon SubmitIcon= new ImageIcon("john1.png");
	Icon Login = new ImageIcon("loginV.png");
	JButton Snacks = new JButton(Snacky);
	JButton Submit = new JButton(SubmitIco);
	JButton LoginX = new JButton(Login);
	ALLOrders write = ALLOrders.getInstance();
	
	JTextArea  Items = new JTextArea();
	JScrollPane scrollPane = new JScrollPane(Items);
	JScrollPane scroll2 = new JScrollPane(Items);
	private int TotalP =0 ; 

	//JScrollPane Scroll = new JScrollPane(JohnSnack);
	
	
	//Counters for the  Quantity of Snacks Ordered, Usage can e found in the ActionPerformed Function
	int i =0;    
	int p = 0;
	int c = 0;
	int b = 0,o=0;
	
	

	Icon snickers = new ImageIcon("Snack Pic\\snick.png"); 
	JButton Snickers = new JButton(snickers);
	Icon oreo = new ImageIcon("Snack Pic\\oreo.png");
	JButton Oreo = new JButton(oreo);
	

	Icon pringles = new ImageIcon("Snack Pic\\prin.png"); 
	JButton Pringles = new JButton(pringles);
	
	Icon crix= new ImageIcon("Snack Pic\\crixr.png"); 
	JButton Crix = new JButton(crix);
	
	Icon bun = new ImageIcon("Snack Pic\\bun.png"); 
	JButton Bun = new JButton(bun);
	
	JLabel Label7 = new JLabel("Snickers  Price:200\n"
			+ "");
	
	Icon Clear =  new ImageIcon("clear.png");
	
   JButton ClearOrder = new JButton(Clear);
   
    
	
	
   public static void main(String[] args) {
		Test1 gui = new Test1();
		gui.go();
		
	}
	public void go() {
		frame =new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Icon Backgrnd = new ImageIcon("background.png");
		panel1.setBackground(Color.white);
		
		panel2.setBackground(Color.lightGray);
		
		panel3.setBackground(Color.gray);

		
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
		panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
		
		
		//Assigning Panels to SEctions of the Frame 
		frame.getContentPane().add(BorderLayout.WEST, panel1);
		frame.getContentPane().add(BorderLayout.CENTER, panel2);
		frame.getContentPane().add(BorderLayout.EAST, panel3);
		
		
		//Setting Size and Visibility of Frame 
		frame.setSize(900,730);
		frame.setVisible(true);
		JButton buttonWelcome = new JButton(SubmitIcon);
		Font bigFont  = new Font ("Serif",Font.BOLD,28);
		buttonWelcome.setBackground(Color.WHITE);
		buttonWelcome.setFont(bigFont);
		frame.getContentPane().add(BorderLayout.NORTH,buttonWelcome);
		
		
		JButton Login = new JButton("ENTER LOGIN INFORMATION BELOW");
		panel3.add(Login);
		
		Labe4.setBackground(Color.white);
		
		Labe5.setBackground(Color.white);
		
		JButton ORequest = new JButton("Your Order Request");
		panel2.add(ORequest);
		
		
		
		
		
		
		scrollPane.setBounds(10,60,780,500);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		
		
		
		
		
		//JTextField field =  new JTextField("Your Name");
		panel2.add(Labe1);
		panel2.add(field);
		panel2.add(Labe2);
		panel2.add(field1);
		panel2.add(Labe3);
		panel2.add(field3);
		
		field.requestFocus();
		
		
		panel2.add(StuffOrdered);
		panel2.add(Items);
		panel2.add(ClearOrder);
		panel2.add(Labe6);
		
		panel2.add(field6);
		
		
		panel2.add(Submit);
		
		//frame.add(scrollPane);
		Submit.addActionListener(this);
		ClearOrder.addActionListener(this);
		
		
		
		
		//Panel 3 Additions
		
		Icon image1 = new ImageIcon("jj1.png");
		JButton one2 = new JButton(image1);
		
		panel3.add(Labe4);
		panel3.add(field4);
		panel3.add(Labe5);
		panel3.add(field5);
		panel3.add(one2);
		
		panel3.add(LoginX);
		LoginX.addActionListener(this);
		
		
		//Panel 1 Additons
		panel1.add(Snacks);
	
		//panel1.add(JohnSnack);
		Snacks.addActionListener(this);
		

		//Scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		//Scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

		
		//panel1.add(Scroll);
		
		
	
		
		
		
		
		
		
		
		
		panel1.add(Label7);
		
		panel1.add(Snickers);
		JLabel Labe8 = new JLabel("Pringles  Price:300");
		JLabel Labe9 = new JLabel("Crix Biscuit  Price:130");
		JLabel Labe10 = new JLabel("Spice Bun    Price:350");
		JLabel Labe11 = new JLabel("Oreo         Price: 50");
		panel1.add(Labe8);
		
		panel1.add(Pringles);

		panel1.add(Labe9);
		panel1.add(Crix);
		
		panel1.add(Labe10);
		
		panel1.add(Bun);
		panel1.add(Labe11);
		panel1.add(Oreo);
		
		Snickers.addActionListener(this);
		Pringles.addActionListener(this);
		Crix.addActionListener(this);
		Bun.addActionListener(this);
		Oreo.addActionListener(this); 
		Items.setEditable(false);
		
		field6.setEditable(false);
		
		
		
		
		
		Labe1.setOpaque(true);
		Labe1.setBackground(Color.WHITE);
		
		Labe2.setOpaque(true);
		Labe2.setBackground(Color.WHITE);
		
		Labe3.setOpaque(true);
		Labe3.setBackground(Color.WHITE);
		
		
		Labe4.setOpaque(true);
		Labe4.setBackground(Color.WHITE);
		
		
		Labe5.setOpaque(true);
		Labe5.setBackground(Color.WHITE);
		
		
		Labe6.setOpaque(true);
		Labe6.setBackground(Color.WHITE);
		
		
		Labe8.setOpaque(true);
		Labe8.setBackground(Color.WHITE);
		
		Labe9.setOpaque(true);
		Labe9.setBackground(Color.WHITE);
		
		
		Labe10.setOpaque(true);
		Labe10.setBackground(Color.WHITE);
		
		
		Labe11.setOpaque(true);
		Labe11.setBackground(Color.WHITE);
		
		
		Label7.setOpaque(true);
		Label7.setBackground(Color.WHITE);
		StuffOrdered.setOpaque(true);
		StuffOrdered.setBackground(Color.WHITE);
		
	}
	
	
	
	
	public void actionPerformed(ActionEvent e) {
		try {
		
		
		//funcion that accepts a listener function and then perfoms a function based on the button selected.
		if(e.getSource().equals(Submit)) {
			addOrder();
		
			
		}
		if(e.getSource().equals(LoginX)) {
			selectLogin();
			
			
			
		}
		if(e.getSource().equals(Snacks)) {
			viewSnacks();
		}
		 if(e.getSource().equals(Snickers)) {
			 i++;
				 Snack w = new Snack(1,"Snickers",200,"www");
				 Items.setText("\nSnack Name\tQuantity\nSnickers\t "+i+"\nPringles\t"+p+"\nBun\t "+b+"\nCrix \t"+c+"\nOreo \t"+o);
				 TotalP = TotalP +200;
				 
				 field6.setText(Integer.toString(TotalP));
			 }
		 if(e.getSource().equals(Pringles)) {
			 p++;
				
			 Items.setText("\nSnack Name\tQuantity\nSnickers\t "+i+"\nPringles\t"+p+"\nBun\t "+b+"\nCrix \t"+c+"\nOreo \t"+o);
				 TotalP = TotalP +300;
				 field6.setText(Integer.toString(TotalP));
			 }
		 if(e.getSource().equals(Bun)) {
			 b++;
				
			 Items.setText("\nSnack Name\tQuantity\nSnickers\t "+i+"\nPringles\t"+p+"\nBun\t "+b+"\nCrix \t"+c+"\nOreo \t"+o);
				 TotalP = TotalP +350;
				 field6.setText(Integer.toString(TotalP));
			 }
		 if(e.getSource().equals(Crix)) {
			 c++;
			 Items.setText("\nSnack Name\tQuantity\nSnickers\t "+i+"\nPringles\t"+p+"\nBun\t "+b+"\nCrix \t"+c+"\nOreo \t"+o);
				 TotalP = TotalP +130;
				 field6.setText(Integer.toString(TotalP));
			 }
		if(e.getSource().equals(ClearOrder)) {
			clearOrder();
			
		}if(e.getSource().equals(Oreo)) {
			o++;
			Items.setText("\nSnack Name\tQuantity\nSnickers\t "+i+"\nPringles\t"+p+"\nBun\t "+b+"\nCrix \t"+c+"\nOreo \t"+o);
			 TotalP = TotalP +50;
			 field6.setText(Integer.toString(TotalP));
			
		}
		
		}catch(NullPointerException ex) {
			ex.printStackTrace();
			
		}catch(Exception re) {
			re.printStackTrace();
			
			
		}
		
	}
	
	
	public void VerifyLogin() {
		
		
		String Username=field4.getText();
		String Passwrd = field5.getText();
		String X = "John";
		String Y = "getA";
		String Q ="Rider";
		String Z = "giveMeA";
		
		if ((Username.equals(X)&&Passwrd.equals(Y))||(Username.equals(Q)&&Passwrd.equals(Z))) {
			
			JOptionPane.showMessageDialog(frame,"Correct Login ");
			
			//Function should be called to open a new face of a hui
			//which will do a retrive all method from the database and show the existin orders
			clearFields();
				
			viewOrders();
			
			
			
		}else {
			
			JOptionPane.showMessageDialog(frame,"Incorrect Login \n Please  Renter");
			clearFields();
			
		}
		
		
		
	}
	public void addOrder() {
		if(field.getText().equals("")||field1.getText().equals("")||field3.getText().equals(""))
			{
				JOptionPane.showMessageDialog(frame,"Please Fill Out All Fields ");
				
			}else {
		String X =field.getText();
		String XY =field1.getText();
		String XYZ =field3.getText();
		Order.getStudent().setName(X);
		Order.getSnack().setName(Items.getText());
		
		int a = Integer.parseInt(XY);
		Order.getStudent().setStudentID(a); 
		Order.setLocation(XYZ);
		Order.setTotalPrice((float)TotalP);
		
		write.serializeOrder(Order);
		JOptionPane.showMessageDialog(frame,"Order Has Been Submited \n Thank You ");
		clearFields();
		}
	}
	public void clearFields() {
		field.setText("");
		field3.setText("");
		field1.setText("");
		field4.setText("");
		field5.setText("");field6.setText("");Items.setText("");
		i=0;
		b=0;
		c=0;
		p=0;
		o=0;
		TotalP=0;
		field6.setText("");
		
	}
	
	public void clearOrder() {
		Items.setText("");
		field6.setText("");
		i=0;
		b=0;
		c=0;
		p=0;
		o=0;
		TotalP=0;
	}
	public void viewOrders() {
		frame2 = new JFrame();
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setSize(740,740);
		frame2.setVisible(true);
		OrderRequest order = null;
		
		
		
		JButton top = new JButton ("Outstanding  Orders");
		frame2.getContentPane().add(BorderLayout.NORTH,top);
		
		 JTextArea PrintOrders = new JTextArea(5,7);
		 PrintOrders.setEditable(false);
		 frame2.add(PrintOrders);
		 
		 JScrollPane scroll = new JScrollPane(PrintOrders);
		 frame2.add(scroll);
		 ALLOrders win = ALLOrders.getInstance();
		 
		 String orderview="";
		 orderview = win.readall();
		
		PrintOrders.setText(orderview);
			  
			
		 }
		 
		 public void action(ActionEvent t) {
			 
			
			 
		 }
		 
		
	
	public void viewSnacks() {
		
		
	
	}
	


public void selectLogin() {
	VerifyLogin();
}


}//End of Class
class ImagePanel extends JPanel{
	
	private Image img;
	public ImagePanel(String img) {
	    this(new ImageIcon(img).getImage());
	  }

	  public ImagePanel(Image img) {
	    this.img = img;
	    Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
	    setPreferredSize(size);
	    setMinimumSize(size);
	    setMaximumSize(size);
	    setSize(size);
	    setLayout(null);
	  }

	  public void paintComponent(Graphics g) {
	    g.drawImage(img, 0, 0, null);
	  }

	
	
	

}
   
