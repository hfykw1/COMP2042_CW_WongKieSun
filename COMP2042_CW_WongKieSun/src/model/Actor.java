package model;

import javafx.scene.image.ImageView;
import view.World;

import java.util.ArrayList;


public abstract class Actor extends ImageView{
	
	protected int speed=1;
	private int speedMultiplier;
	
	
    public void move(double dx, double dy) {
        setX(getX() + dx);
        setY(getY() + dy);
    }
    
   
    public World getWorld() {
        return (World) getParent();
    }
    
   
    public double getWidth() {
        return this.getBoundsInLocal().getWidth();
    }

   
    public double getHeight() {
        return this.getBoundsInLocal().getHeight();
    }
   
    public <A extends Actor> java.util.List<A> getIntersectingObjects(java.lang.Class<A> cls){
        ArrayList<A> someArray = new ArrayList<A>(); //new array list of type A which is an actor
        for (A actor: getWorld().getObjects(cls)) {
            if (actor != this && actor.intersects(this.getBoundsInLocal())) {
                someArray.add(actor);
            }
        }
        return someArray;
    }
    
    public abstract void act(long now);
        
    
    public void setSpeed() {
		
    	speed++;
    	this.speed= speed*this.speed;
    	
    }
    
    public int getSpeed() {
    	return speed;
    }

}
