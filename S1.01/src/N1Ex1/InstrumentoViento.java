package N1Ex1;

    public class InstrumentoViento extends Instrumento {

        public InstrumentoViento (String nombre, int precio) {

            super (nombre, precio);
        }
        @Override
        public void tocar () {

            System.out.println("Está sonando un instrumento de viento");
        }
    }

