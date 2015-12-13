/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.models.Block;
import com.models.Mario;
import com.models.World;

/**
 *
 * @author rainy
 */
public class WorldRenderer {
    private SpriteBatch batch;
    private Viewport viewport;
    private OrthographicCamera camera;
    public final int V_WIDTH = 800;
    public final int V_HEIGHT = 600;
    private World world;
    private Mario mario;
    
    
    public WorldRenderer(World w){
        world = w;
        camera = new OrthographicCamera();
        viewport = new FitViewport(V_WIDTH, V_HEIGHT, camera);
    batch = new SpriteBatch();
    AssetManager.load();
        
    }
    
    public void render(float delta) {
       //clear the screen with black
        Gdx.gl20.glClearColor(0, 0, 0, 1);
        Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);
        
        camera.position.x = V_WIDTH/2f;
        
        camera.position.y = V_HEIGHT/2f;
        
        camera.update();
        
        //links the camera to the screen
        batch.setProjectionMatrix(camera.combined);
        //tells the renderer this is the list
        batch.begin();
        
        for (Block b: world.getBlocks()){
            batch.draw(AssetManager.block, b.getX(), b.getY());
        }
        batch.draw(AssetManager.marioStand, mario.getX(), mario.getY());
        //list of things to draw
        //finished listing things to draw
        batch.end();
        
        
    }
    
    public void resize(int width, int height){
        viewport.update(width, height);
    }
}
