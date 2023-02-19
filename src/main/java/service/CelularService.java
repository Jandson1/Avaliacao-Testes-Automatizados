package service;
import model.Celular;

public interface CelularService {

    void ligar(Celular celular) throws Exception;

    void desligar(Celular celular);

    String volumeAtual(Celular celular);

    void aumentarVolume(Celular celular, int volumeAMais) throws Exception;

    void diminuirVolume(Celular celular, int volumeAMenos) throws Exception;

    void desbloquear(Celular celular, boolean desbloquear) throws Exception;

}
