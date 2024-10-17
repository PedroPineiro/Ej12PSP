public class Main {
    public static void main(String[] args) {
        Contador contador = new Contador();

        Thread hilo1 = new Thread(new Hilo(contador));
        Thread hilo2 = new Thread(new Hilo(contador));
        Thread hilo3 = new Thread(new Hilo(contador));
        Thread hilo4 = new Thread(new Hilo(contador));

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();

    }
}
