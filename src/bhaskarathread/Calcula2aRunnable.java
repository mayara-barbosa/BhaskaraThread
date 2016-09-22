package bhaskarathread;

/**
 *
 * @author mayara.barbosa
 */
public class Calcula2aRunnable implements Runnable{

    private float a;
    private float result;

    public Calcula2aRunnable(float a) {
        this.a = a;
        this.result = 0;
    }
    
    
    @Override
    public void run() {
        result = 2 *a;
    }
    
    public float getResult(){
        return result;
    }
}
