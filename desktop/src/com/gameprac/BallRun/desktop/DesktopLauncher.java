package com.gameprac.BallRun.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.gameprac.BallRun.BallRunGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title="Ball Run v.1.0.0 Alpha";
        config.width = 800;
        config.height =480;
		new LwjglApplication(new BallRunGame(), config);
	}
}
