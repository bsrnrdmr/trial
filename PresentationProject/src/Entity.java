import java.awt.Graphics;
import java.io.Serializable;


/**
 * 
 */

/**
 * @author busra
 *
 */
	public class Entity implements Serializable{
	public String text;
	public int x;
	public int y;
	
	public Entity(String text,int x,int y){			
		this.text=text;
		this.x=x;
		this.y=y;
	}
	public void drawYourself(Graphics g){		//creates the entities
		g.drawString(text, x, y);
	}
	
	
	
	
	
	}
