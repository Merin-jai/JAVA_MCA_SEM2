import java.io.*;
import java.awt.*;
import java.awt.event.*;
class CFrame extends Frame   {
	public CFrame()   {
		super("Testing....");
		this.addWindowListener(new WindowAdapter() {
        		public void windowClosing(WindowEvent windowEvent){
            			setVisible(false);
				System.exit(0);
         		}
		});
		setSize(500,500);
		setVisible(true);

	}	
}
class frame2 {
	public static void main(String args[])   {
		CFrame obj = new CFrame();	
	}
}
