package bhaskarathread;

import java.util.Scanner;

/**
 *
 * @author mayara.barbosa
 */
public class Program {

    
    public static void main(String[] args) throws InterruptedException {
        float a , b, c, delta, positivo, negativo;
        Scanner sc;
        sc = new Scanner(System.in);
        
        System.out.println("Digite o valor de a: ");
        a= sc.nextFloat();
        System.out.println("Digite o valor de b: ");
        b= sc.nextFloat();
        System.out.println("Digite o valor de c: ");
        c= sc.nextFloat();
        
        CalculaB2Runnable cb2 = new CalculaB2Runnable(b);
        Calcula4acRunnable cqac = new Calcula4acRunnable(a, c);
        
        Thread th1, th2,th3,th4;
        th1 = new Thread(cb2);
        th2 = new Thread(cqac);
        
        th1.start();
        th2.start();
        th1.join();
        th2.join();
        
        /*CalculaDeltaRunnable cdr = new  CalculaDeltaRunnable(cb2.getResult(), cqac.getResult());
        th3 = new Thread(cdr);
        
        th3.start();
        th3.join();*/
        
        delta = cb2.getResult() - cqac.getResult();
        if(delta > 0){
            CalculaDeltaRunnable cdr = new CalculaDeltaRunnable(delta);
            Calcula2aRunnable c2a = new Calcula2aRunnable(a);
            
            th3 = new Thread(cdr);
            th4 = new Thread(c2a);
            th3.start();
            th4.start();
            th3.join();
            th4.join();
            
            if(c2a.getResult() == 0){
                System.out.println("div por 0");
                
            }
            negativo = ((b * (-1)) - delta)/c2a.getResult();
            positivo = ((b*(-1)) + delta)/c2a.getResult();
            System.out.println("Raiz positiva = "+ positivo);
            System.out.println("Raiz negativa = " + negativo);
        }
        else if(delta == 0){
            Calcula2aRunnable c2a = new Calcula2aRunnable(a);
            th4 = new Thread(c2a);
            th4.start();
            th4.join();
            
            if(c2a.getResult() == 0){
                System.out.println("div por 0");
            }
            
            positivo = (b*(-1))/c2a.getResult();
            System.out.println("A raiz é: " + positivo);
            
        }else if(delta < 0)
        {
            System.out.println("Não possui raiz real");
        }
                
    }
    
}
