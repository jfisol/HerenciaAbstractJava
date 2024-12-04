import org.figueroa.pooclasesabstractas.elementos.ElementoForm;
import org.figueroa.pooclasesabstractas.elementos.InputForm;
import org.figueroa.pooclasesabstractas.elementos.SelectForm;
import org.figueroa.pooclasesabstractas.elementos.TextAreaForm;
import select.Opcion;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        InputForm password = new InputForm("password", "password");
        InputForm email = new InputForm("email", "email");
        InputForm edad = new InputForm("edad", "number");

        TextAreaForm experiencia = new TextAreaForm("exp",5,9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        Opcion java = new Opcion("1","java");
        lenguaje.addOpciones(java)
        .addOpciones(new Opcion("2","python"))
        .addOpciones(new Opcion("3","javaScript"))
        .addOpciones(new Opcion("4","PHP"));

        username.setValor("Jhon Street");
        password.setValor("123*");
        email.setValor("street.com");
        edad.setValor("28");
        experiencia.setValor(" ...Es una experiencia nueva");
        java.setSelected(true);

        List<ElementoForm> elementos = new ArrayList<ElementoForm>();
        elementos.add(username);
        elementos.add(password);
        elementos.add(email);
        elementos.add(experiencia);
        elementos.add(lenguaje);

        for(ElementoForm e: elementos){
            System.out.println(e.dibujarHtml());
        }
    }
}