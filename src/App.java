
import models.Caja;
import models.Par;

public class App {

    public static void main(String[] args) throws Exception {

        System.out.println("=== PRÁCTICA DE CLASE GENERICAS === \n");

        System.out.println("--- Uso de Caja<T> ---");
        Caja<String> cajaDeTexto = new Caja<>();
        Caja<Integer> entero = new Caja<>();
        Caja<Double> decimales = new Caja<>();
        Caja<Boolean> booleanCaja = new Caja<>();

        cajaDeTexto.setT("Hola Mundo");
        entero.setT(80);
        decimales.setT(10.5);
        booleanCaja.setT(false);
        
        System.out.println("Caja de texto: " + cajaDeTexto.getT());
        System.out.println("Caja de entero: " + entero.getT());
        System.out.println("Caja de decimal: " + decimales.getT());
        System.out.println("¿La caja de texto está vacía?:" + booleanCaja.getT());
        System.out.println();

        System.out.println("--- Uso de Par<K,V> ---");
        Par<Integer, String> par = new Par<>();
        Par<String, Integer> par1 = new Par<>();
        Par<String, Double> par2 = new Par<>();

        par.setK(1);
        par.setV("Juan Pérez");
        par1.setK("Edad");
        par1.setV(20);
        par2.setK("Promedio");
        par2.setV(8.75);

        System.out.println("Clave : " + + par.getK() + " | " + "Valor : " + par.getV());
        System.out.println("Clave : " + par1.getK() + " | "+ "Valor : " + par1.getV());
        System.out.println("Clave : " + par2.getK() +" | " + "Valor : " + par2.getV());
    }

}
