package model;

import java.util.Objects;

public class Celular {

    private String cor;
    private String marca;
    private String modelo;
    private boolean ligado;
    private int volumeAtual;
    private boolean desbloqueado;

    public Celular(String cor, String marca, String modelo, int volumeAtual) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.ligado = false;
        this.volumeAtual = volumeAtual;
        this.desbloqueado = false;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getVolumeAtual() {
        return volumeAtual;
    }

    public void setVolumeAtual(int volumeAtual) {
        this.volumeAtual = volumeAtual;
    }

    public boolean isDesbloqueado() {
        return desbloqueado;
    }

    public void setDesbloqueado(boolean bloqueado) {
        this.desbloqueado = bloqueado;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ligado=" + ligado +
                ", volumeAtual=" + volumeAtual +
                ", bloqueado=" + desbloqueado +
                '}';
    }
}
