package com.jeremy.resolute.desktop;

import java.awt.Toolkit;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.jeremy.resolute.Resolute;

public class DesktopLauncher {
	public static void main (String[] arg) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		toolkit.getScreenResolution();
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 160;
		config.height = 120;
		new LwjglApplication(new Resolute(), config);
	}
}
