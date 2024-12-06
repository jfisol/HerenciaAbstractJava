import org.figueroa.pooclasesabstractas.elementos.*;
import org.figueroa.pooclasesabstractas.elementos.validador.*;
import select.Opcion;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());

        InputForm password = new InputForm("password", "password");
        password.addValidador(new RequeridoValidador());
             // .addValidador(new LargoValidador(6,12));

        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador());
        email.addValidador(new EmailValidador());

        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new NumeroValidador());


        TextAreaForm experiencia = new TextAreaForm("exp",5,9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        Opcion java = new Opcion("1","java");
        lenguaje.addOpciones(java)
        .addOpciones(new Opcion("2","python"))
        .addOpciones(new Opcion("3","javaScript"))
        .addOpciones(new Opcion("4","PHP"));

        /*Implementar clases anónimas*/
        ElementoForm saludar = new ElementoForm("saludar") {
            @Override
            public String dibujarHtml() {
                return "<input disabled name = '"+this.nombre+"' value = '"+this.valor+"' >";
            }
        };

        saludar.setValor("Esta campo esta inhabilitado");
        username.setValor("Jhon Street");
        password.setValor("");
        email.setValor("dfsdds@hhh.com");
        edad.setValor("25");
        experiencia.setValor(" ...Es una experiencia nueva");
        java.setSelected(true);

        List<ElementoForm> elementos = new ArrayList<ElementoForm>();
        elementos.add(username);
        elementos.add(password);
        elementos.add(email);
        elementos.add(experiencia);
        elementos.add(lenguaje);
        elementos.add(saludar);

        for(ElementoForm e: elementos){
            System.out.println(e.dibujarHtml());
        }
        
        //VALIDAMOS LOS ELEMENTOS
        elementos.forEach(e -> {
            if (!e.isValido()){
                e.getErrores().forEach(err -> System.out.println( e.getNombre() +": "+ err));
            }
        });
            
        }
        
    }
