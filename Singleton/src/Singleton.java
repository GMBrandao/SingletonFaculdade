public final class Singleton {
    private static volatile Singleton instancia;

    public String valor;

    private Singleton(String value) {
        this.valor = value;
    }

    public static Singleton getInstancia(String value) {
        Singleton resultado = instancia;
        if (resultado != null) {
            return resultado;
        }
        synchronized(Singleton.class) {
            if (instancia == null) {
            	instancia = new Singleton(value);
            }
            return instancia;
        }
    }
}