package org.figueroa.pooclasesabstractas.elementos.validador;

public class RequeridoValidador extends Validador{

   private String mensaje="  El campo  %s es requerido";
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
        return (valor != null && valor.isBlank());//isBlank valida que aparte de que no sea vacio
    }
}
