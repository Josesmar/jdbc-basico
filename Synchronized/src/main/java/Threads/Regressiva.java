package Threads;
public class Regressiva implements Runnable {


    public void main(String[] args) {
        run();
        incrementa();
        decrementa();
    }
    boolean continua = true;
    int i = 11;

    public void  run(){
        while(continua) {
            synchronized(this){
                i--;
                System.out.println(i);
                if (i==0) continua=false;
            }
        }
    }

    public synchronized void incrementa(){
        quantidade++;
    }
    public synchronized void decrementa()
    {
        quantidade--;
    }
}

