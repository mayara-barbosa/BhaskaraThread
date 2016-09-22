package bhaskarathread;

/**
 *
 * @author mayara.barbosa
 */
public class CalculaB2Runnable implements Runnable{

    private float b;
    private float result;

    public CalculaB2Runnable(float b) {
        this.b = b;
        this.result = 0;
    }
    
       
    @Override
    public void run() {
        result = b * b;
    }
    
    public float getResult(){
        return result;
    }
    
}
