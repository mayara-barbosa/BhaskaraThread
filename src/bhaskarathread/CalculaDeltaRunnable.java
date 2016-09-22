/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bhaskarathread;

/**
 *
 * @author mayara.barbosa
 */
public class CalculaDeltaRunnable implements Runnable{
//calcula raiz de delta
    private float b2;
    private float qac;
    private float delta;
    private float result;

    public CalculaDeltaRunnable(float delta) {
        
        this.delta = delta;
        this.result = 0;
    }
    
    
    @Override
    public void run() {
        
        result = (float) Math.sqrt(delta);
    }
    
    public float getResult(){
        return result;
    }
    
}
