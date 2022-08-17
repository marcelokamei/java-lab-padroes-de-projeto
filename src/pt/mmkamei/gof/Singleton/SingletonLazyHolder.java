package pt.mmkamei.gof.Singleton;

/**
 * Singleton 'Lazy Holder'
 *
 * @see <a href="https://stackoverflow.com/a/24018148"></a>
 *
 * @author marcelokamei
 */

public class SingletonLazyHolder {

    private static class InstanceHolder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();

    }

    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}
