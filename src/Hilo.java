public class Hilo implements Runnable {
    private Contador contador;

    public Hilo(Contador contador) {
        this.contador = contador;
    }

    @Override
    public synchronized void run() {
        for (int i = 0; i < 100; i++) {
            contador.incrementar();;
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
