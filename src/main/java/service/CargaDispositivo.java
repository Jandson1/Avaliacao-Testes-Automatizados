package service;

import model.Celular;

public interface CargaDispositivo {

    static boolean dispositivoDescarregado(Celular celular) throws Exception {
        return false;
    }

}
