package se.edstrompartners.warlock;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class MainMenu extends BasicGameState {

    @Override
    public void init(GameContainer c, StateBasedGame s) throws SlickException {
        // TODO Auto-generated method stub

    }

    @Override
    public void render(GameContainer c, StateBasedGame s, Graphics g) throws SlickException {
        g.drawLine(100, 100, 200, 200);

    }

    @Override
    public void update(GameContainer c, StateBasedGame s, int delta) throws SlickException {
        // TODO Auto-generated method stub

    }

    @Override
    public int getID() {
        return Game.ID.MAINMENU;
    }

}
