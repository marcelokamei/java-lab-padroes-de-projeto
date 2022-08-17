package pt.mmkamei.gof.Singleton;

/**
 * Singleton 'apressado'
 * @author marcelokamei
 */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
