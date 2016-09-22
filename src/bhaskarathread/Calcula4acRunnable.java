package bhaskarathread;

/**
 *
 * @author mayara.barbosa
 */
public class Calcula4acRunnable implements Runnable{

    private float a;
    private float c;
    private float result;

    public Calcula4acRunnable(float a, float c) {
        this.a = a;
        this.c = c;
        this.result = 0;
    }
    
    
    @Override
    public void run() {
        
        result = 4 * a * c;
    }
    
    public float getResult(){
        return result;
    }
    
}
