package com.jeremy.resolute;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Resolute extends ApplicationAdapter {
	
	private OrthographicCamera camera;
	private SpriteBatch batch;
	private Texture image;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		image = new Texture("square.jpg");
		image.setFilter(TextureFilter.Nearest, TextureFilter.Nearest);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(image, 0, 0);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		image.dispose();
	}
	
	@Override
	public void resize(int width, int height) {
		camera = new OrthographicCamera(width, height);
	}
	
}
