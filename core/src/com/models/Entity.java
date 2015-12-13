/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.models;

import com.badlogic.gdx.math.Rectangle;

/**
 *
 * @author rainy
 */
public abstract class Entity {
    private Rectangle bounds;
    
    public Entity(float x, float y, float width, float height){
        bounds = new Rectangle( x, y, width, height);
    }
    
    public void addToPosition(float x, float y){
        bounds.x += x;
        bounds.y += y;
    }
    
    public float getX(){
        return bounds.x;
    }
    
    public float getY(){
        return bounds.y;
    }
    
    public float getWidth(){
        return bounds.width;
    }
    
    public float getHeight(){
        return bounds.height;
    }
    
    public boolean isColliding(Entity other){
        return bounds.overlaps(other.bounds);
    }
    
    public float getOverlapX (Entity other){
        float overlap = Math.min(this.bounds.x +this.bounds.width, other.bounds.x +other.bounds.width) - Math.max(this.bounds.x, other.bounds.x);
        return overlap;
    }
    
    public float getOverlapY (Entity other){
        float overlap = Math.min(this.bounds.y +this.bounds.height, other.bounds.y +other.bounds.height) - Math.max(this.bounds.y, other.bounds.y);
        return overlap;
    }
}
    
    
