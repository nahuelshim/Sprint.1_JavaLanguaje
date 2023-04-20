package N1Ex1;

public class InstrumentoPercusion extends Instrumento {

    public InstrumentoPercusion(String nombre, int precio) {
        super(nombre, precio);
    }

    public void tocar () {

        System.out.println("Está sonando un instrumento de percusion");
    }
}