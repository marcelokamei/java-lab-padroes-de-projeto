package pt.mmkamei.gof.Singleton;

/**
 * Singleton 'Preguiçoso'
 *
 * @author marcelokamei
 */
public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
