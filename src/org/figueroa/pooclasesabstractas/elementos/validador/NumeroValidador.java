package org.figueroa.pooclasesabstractas.elementos.validador;

public class NumeroValidador extends Validador{


    protected  String mensaje ="  El campo debe de ser un número";

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
        try {
            Integer.parseInt(valor);
            return true;
        }catch (NumberFormatException e){
            return false;
        }

    }


}
