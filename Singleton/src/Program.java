

public class Program {

	public static void main(String[] args) {
        System.out.println("O mesmo valor deve aparecer duas vezes" + "\n" +
                "Se aparecer os valores diferentes 2 instâncias Singleton foram criadas" + "\n\n" +
                "Resultado:" + "\n");
        
        Thread thread1 = new Thread(new ThreadUm());
        Thread thread2 = new Thread(new ThreadDois());
        
        thread1.start();
        thread2.start();
    }

	static class ThreadUm implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstancia("primeiro valor");
            System.out.println(singleton.valor);
        }
    }

	static class ThreadDois implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstancia("segundo valor");
            System.out.println(singleton.valor);
        }
	}
	
}
