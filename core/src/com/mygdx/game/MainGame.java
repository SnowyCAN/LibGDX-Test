/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game;

import com.Screens.WorldRenderer;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.models.Mario;
import com.models.World;

/**
 *
 * @author rainy
 */
public class MainGame implements Screen{
    private World world;
    private Mario mario;
    private WorldRenderer renderer;
    
    public MainGame(){
        world = new World();
        mario = world.getMario();
        renderer = new WorldRenderer(world);
        
    }
    
    @Override
    public void show() {

    }

    /**
     * clears
     * @param delta the time since the last render
     */
    @Override
    public void render(float deltaTime){
        if(Gdx.input.isKeyPressed(Keys.D)){
            mario.setVelocityX(2f);
        }else if(Gdx.input.isKeyPressed(Keys.A)){
            mario.setVelocityX(-2f);
        }
        mario.update(deltaTime);
        //draw the screen
        renderer.render(deltaTime);
    }
    //called to change the resolution
    @Override
    public void resize(int width, int height) {
        renderer.resize(width, height);
    }

    //called if the screen was minimzed
    @Override
    public void pause() {
        
    }

    //reverses the pause
    @Override
    public void resume() {
        
    }

    //opposite of show
    @Override
    public void hide() {
        
    }

    @Override
    public void dispose() {
        
    }
}
