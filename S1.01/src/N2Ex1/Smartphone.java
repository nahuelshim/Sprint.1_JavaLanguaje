package N2Ex1;

public class Smartphone extends Telefono implements Camara, Reloj { // implementando interficies.

    public Smartphone(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void fotografiar() {
        System.out.println("Se está haciendo una foto");
    }

    @Override
    public void alarma() {
        System.out.println("Está sonando la alarma");
    }
}
