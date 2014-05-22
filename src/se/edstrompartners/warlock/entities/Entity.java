package se.edstrompartners.warlock.entities;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public interface Entity {
	
	public void render(GameContainer c, Graphics g, int delta);
	
	/* Returns true: indicating removal; else false */
	public boolean update(GameContainer c, int delta);
	
	
}
