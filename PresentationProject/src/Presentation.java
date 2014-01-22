import java.awt.Graphics;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;



public class Presentation implements Serializable{
	int currentSlide=0;
	Graphics g;
	ArrayList<Slide> slides = new ArrayList();	//stores all slides in a presentation
	public Presentation(){
		super();
		slides.add(new Slide());
		//creates a file text.txt and writes all objects on the file 
				FileOutputStream fos = null;
				ObjectOutputStream out = null;
				try {
					fos = new FileOutputStream("text.txt");
					out = new ObjectOutputStream(fos);
					for(int i=0;i<slides.size();i++){
					out.writeObject(slides.get(i));
					}
					out.close();
					System.out.println("Object Persisted");
				} catch (IOException ex) {
					ex.printStackTrace();
				}
	}
	public void drawYourself(Graphics g){
		
		slides.get(currentSlide).drawYourself(g);		//draws slides on the window
		
	}
	
	public void rightPressed()				//switches to the next slide when right button is pressed
	{
		
		slides.add(new Slide());
		currentSlide ++;
		slides.get(currentSlide).drawYourself(g);
		
	}
	public void leftPressed()				//switches to the previous slide when left button is pressed
	{
		
		if(currentSlide>=1){
		currentSlide --;
		slides.get(currentSlide);
		}else{
		currentSlide =0;	
		}
		
	}
	
	public void downPressed()			//clears the page when down key is pressed
	{
		
		slides.set(currentSlide, new Slide());
	}
	public void delete(){				//deletes the slide when backspace button is pressed
		slides.remove(currentSlide);
	}


}
