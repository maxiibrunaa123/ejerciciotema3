// Primera parte:
// Crear una función con tres parámetros que sean números que se suman entre sí.
// Llamar a la función en el main y darle valores.

public class main {

    public static void main(String[] args) {

         suma(10, 15, 20);
         coche miCoche = new coche();
         miCoche.sumaPuerta();

         System.out.println(miCoche.puerta);

    }
    public static void suma(int a, int b, int c) {
        int resultado;
        resultado = a + b + c;
        System.out.println(resultado);
    }
}

class coche {
    public int puerta = 0;

    public void sumaPuerta() {
            this.puerta ++;

    }
}

