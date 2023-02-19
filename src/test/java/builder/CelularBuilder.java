package builder;
import model.Celular;

public class CelularBuilder {

    private Celular celular;

    public static CelularBuilder retonarCelularBuilder() {
        CelularBuilder celularBuilder = new CelularBuilder();
        celularBuilder.celular = new Celular("cor", "marca", "modelo", 5);
        return celularBuilder;
    }

    public Celular get() {
        return celular;
    }

    public CelularBuilder ligado() {
        celular.setLigado(true);
        return this;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }

}
