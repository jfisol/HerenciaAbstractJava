package org.figueroa.pooclasesabstractas.elementos.validador;

abstract public class Validador {

    protected String mensaje;

    abstract public void setMensaje(String mensaje);
    abstract public String getMensaje();
    abstract public boolean isValidate(String valor);
}
