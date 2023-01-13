package com.example.ejemploweb;

public class RespuestaFecha {
    private boolean valida;
    private String mensaje;

    public RespuestaFecha(boolean valida, String mensaje) {
        this.valida = valida;
        this.mensaje = mensaje;
    }

    public boolean isValida() {
        return valida;
    }

    public void setValida(boolean valida) {
        this.valida = valida;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
