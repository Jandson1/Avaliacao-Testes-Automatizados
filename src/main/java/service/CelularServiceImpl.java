package service;

import model.Celular;

public class CelularServiceImpl implements CelularService {

    private CargaDispositivo cargaDispositivo;
    @Override
    public void ligar(Celular celular) throws Exception {
        if (CargaDispositivo.dispositivoDescarregado(celular)) {
            throw new Exception("Bateria Sem Carga!");
        }else {
            celular.setLigado(true);
        }
    }

    @Override
    public void desligar(Celular celular) {
        celular.setLigado(false);
    }

    @Override
    public String volumeAtual(Celular celular) {
        return "Celular ligado: " + celular.isLigado() + ", Volume: " +celular.getVolumeAtual();
    }

    @Override
    public void aumentarVolume(Celular celular, int volumeAMais) throws Exception {
        if(celular.isLigado()){
            if(volumeAMais <= 0) {
                throw new Exception("É necessário um volume maior que zero");
            }
            else {
                celular.setVolumeAtual(celular.getVolumeAtual() + volumeAMais);
            }
        }
    }

    @Override
    public void diminuirVolume(Celular celular, int volumeAMenos) throws Exception {
        if(celular.isLigado()){
            if(volumeAMenos <= 0) {
                throw new Exception("É necessário um volume maior que zero!");
            }
            if(volumeAMenos >= celular.getVolumeAtual()) {
                celular.setVolumeAtual(0);
            } else {
                celular.setVolumeAtual(celular.getVolumeAtual() - volumeAMenos);
            }
        }
    }

    @Override
    public void desbloquear(Celular celular, boolean desbloquear) throws Exception {
        if (celular.isLigado()) {
            if (desbloquear = false){
                throw new Exception("Celular Bloqueado!");
            }
            else {
                celular.setDesbloqueado(true);
            }
        }
    }
}
