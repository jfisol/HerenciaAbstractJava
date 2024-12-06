package org.figueroa.pooclasesabstractas.elementos.validador;

public class EmailValidador extends Validador{

    protected String mensaje= "  Ingrese un email correcto";

    private final static String EMAIL_REGEX = "[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

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
        return !valor.matches(EMAIL_REGEX);
    }
}
