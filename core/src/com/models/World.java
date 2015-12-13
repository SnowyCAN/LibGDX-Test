/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.models;

import com.badlogic.gdx.utils.Array;

/**
 *
 * @author rainy
 */
public class World {
    private Array<Block> blocks;
    private Mario player;
    
    public World(){
        player = new Mario(16,16,16,32);
        blocks = new Array<Block>();
        
    }
    
    private void demoLevel(){
        for (int i = 0; i < 50; i++) {
            //blocks along the floor
            Block  b = new Block(i*16,0,16,16);
            blocks.add(b);
        }
        
        blocks.add(new Block(48,16,16,16));
        blocks.add(new Block(96,32,16,16));
        blocks.add(new Block(112,32,16,16));
        blocks.add(new Block(128,96,16,16));
        blocks.add(new Block(112,96,16,16));
    }
    
    public void update (float delta){
        
    }
    
    public Mario getMario(){
        return player;
    }
    
    public Array<Block> getBlocks(){
        return blocks;
    }
}
