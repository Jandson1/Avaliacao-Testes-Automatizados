package builder;
import model.Celular;
public class CelularProvider {
    public static Celular get() {
        return new Celular("cor", "marca", "modelo", 5);
    }

    public static Celular getCelularLigado() {
        Celular celular = new Celular("cor", "marca", "ano", 5);
        celular.setLigado(true);
        return celular;
    }

}
