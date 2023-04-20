package N1Ex1;

public abstract class  Instrumento {

    {
        System.out.println("bloque de inicializacion");

    } static {

        System.out.println("bloque estático");
    }

    private String nombre;
    private int precio;

    public Instrumento(String nombre, int precio) {

        this.nombre = nombre;
        this.precio = precio;
    }

    public abstract void tocar (); {

    }
}