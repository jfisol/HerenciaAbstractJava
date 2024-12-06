package org.figueroa.pooclasesabstractas.elementos;

import org.figueroa.pooclasesabstractas.elementos.validador.Validador;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementoForm {

    protected String valor;
    protected String nombre;

    private List<Validador> validadores;
    private List<String> errores;

    public ElementoForm() {
        //inicializando los validadores
        this.validadores = new ArrayList<>();
        this.errores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ElementoForm(String nombre) {
        this(); //llamada a constructor vacio
        this.nombre = nombre;
    }

    public ElementoForm addValidador(Validador validador){
        this.validadores.add(validador);
        return this;
    }

    public List<String> getErrores() {
        return errores;
    }

    public boolean isValido(){
        for (Validador v: validadores) {
                if(v.isValidate(this.valor)){
                    this.errores.add(v.getMensaje());
                }
        }
        return this.errores.isEmpty();//si esta vacia retorna true
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    abstract public String dibujarHtml();
}
