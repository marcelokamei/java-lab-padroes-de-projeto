package pt.mmkamei.gof.subsistema2.cep;

public class CepApi {

    //utilizando Singleton
    private static CepApi instancia = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getInstancia(){
        return instancia;
    }

    //metodos publicos
    public String recuperarCidade(String cep){
        return "Santarém";
    }

    public String recuperarEstado(String cep){
        return "ST";
    }
}
