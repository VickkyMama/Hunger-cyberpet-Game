package CyberPet;


import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

//implements Runnable because the instance is intended to be executed by a thread
public class Fly implements Runnable {

	private ImageIcon pics;
	private JLabel flyLabel;
	private Random s = new Random();
	

	public JLabel addFly(){
		//adding the fly image to label
		pics=new ImageIcon("C:\\Users\\VICTORIA\\workspace\\HungerCyberPet\\src\\CyberPet\\fly.png");
		//Fly image location
		flyLabel=new JLabel();
		flyLabel.setIcon(pics);

		return flyLabel;
}

	
	@Override
	//for the Fly image to move at random and setting boundaries
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			
	        int x = s.nextInt(400);
	        int y = s.nextInt(300);

	        try{ 
	        	flyLabel.setBounds(x, y, 200, 200);
	        	Thread.sleep(1000); 
	        	}
	        catch(InterruptedException e){ }
	}


	}
}



	
