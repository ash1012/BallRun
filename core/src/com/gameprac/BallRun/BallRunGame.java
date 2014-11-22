package com.gameprac.BallRun;

import com.badlogic.gdx.Game;
import com.gameprac.BallRun.Screens.Play;

public class BallRunGame extends Game {

	
	@Override
	public void create () {
        setScreen(new Play());
	}

    @Override
    public void pause() {
        super.pause();
    }

    @Override
    public void resume() {
        super.resume();
    }

    @Override
    public void resize(int width, int height) {
        super.resize(width, height);
    }

    @Override
	public void render () {
        super.render();
	}

    @Override
    public void dispose() {
        super.dispose();
    }

}
