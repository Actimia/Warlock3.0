package se.edstrompartners.warlock;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Game extends StateBasedGame {

    public Game() {
        super("TDF Warlock 3.0");

    }

    public static void main(String[] args) throws SlickException {
        AppGameContainer agc = new AppGameContainer(new Game(), 1024, 720, false);
        agc.setAlwaysRender(true);
        agc.setShowFPS(true);
        agc.setTargetFrameRate(60);
        agc.start();

    }

    @Override
    public void initStatesList(GameContainer c) throws SlickException {
        // TODO Auto-generated method stub
        addState(new MainMenu());
    }

    public static class ID {
        public static final int MAINMENU = 1;
    }
}
