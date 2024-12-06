package org.figueroa.pooclasesabstractas.elementos.validador;

public class NoNullValidador extends Validador{

    protected String mensaje = "  El campo no puede ser nulo";
    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public boolean isValidate(String valor) {
        return (valor != null);
    }
}
