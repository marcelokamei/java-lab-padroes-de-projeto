package pt.mmkamei.gof.Singleton;

public class TesteSingleton {
    public static void main(String[] args) {
        SingletonLazy lasy = SingletonLazy.getInstancia();
        System.out.println(lasy);
        lasy = SingletonLazy.getInstancia();
        System.out.println(lasy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);

    }
}
