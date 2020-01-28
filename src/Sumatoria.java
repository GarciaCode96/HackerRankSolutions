import java.util.Scanner;

public class Sumatoria {

    private Scanner lectura = new Scanner(System.in);

    public void mostrarResultado(){
        System.out.print("Ingres la longitud del arreglo: ");
        int longitud = Integer.parseInt(lectura.next());

        System.out.println("La sumatoria es: " + realizarSumatoria(longitud));
    }

    private int realizarSumatoria(int longitud){
        int resultado = 0;
        int valores[] = new int [longitud];
        for(int indice = 0; indice < longitud; indice++){
            System.out.print("Ingresa un valor: ");
            valores[indice] = Integer.parseInt(lectura.next());
        }

        for(int valor: valores){
            resultado += valor;
        }

        return resultado;
    }
}
