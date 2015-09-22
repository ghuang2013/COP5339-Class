package q4;

import java.io.PrintStream;

public class Screen {
	PrintStream screenTool;
	
	public Screen(PrintStream screenTool){
		this.screenTool = screenTool;
	}
	
	public void display(Receipt receipt){
		screenTool.println(receipt);
	}
	
	public void display(Product product){
		screenTool.println(product);
	}
	
	public void display(String msg){
		screenTool.println(msg);
	}
}
