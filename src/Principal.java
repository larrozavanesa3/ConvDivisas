import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consultar = new ConsultarMoneda();

        int opcion = 0;
        while (opcion != 8) {
            System.out.println("*********************************************");
            System.out.println("Bienvenido al conversor de monedas");
            System.out.println("*********************************************");
            System.out.println("Ingrese la conversión que desea realizar:");
            System.out.println("1. Dólar a Peso Argentino");
            System.out.println("2. Peso Argentino a Dólar");
            System.out.println("3. Dólar a Real Brasileño");
            System.out.println("4. Real Brasileño a Dólar");
            System.out.println("5. Dólar a Peso Colombiano");
            System.out.println("6. Peso Colombiano a Dólar");
            System.out.println("7. Convertir otra moneda");
            System.out.println("8. Salir");

            opcion = lectura.nextInt();
            lectura.nextLine();

            switch(opcion){

                case 1:
                    ConvertirMoneda.convertir("USD", "ARS",consultar, lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir("ARS", "USD", consultar, lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD", "BRL", consultar, lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir("BRL", "USD", consultar, lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD", "COP", consultar, lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir("COP", "USD", consultar, lectura);
                    break;
                case 7:
                    ConvertirMoneda.convertirOtraMoneda(consultar, lectura);
                    break;
                case 8:
                    System.out.println("Saliendo");
                    break;

                default:
                    System.out.println("Opcion no valida, vuelve a intentarlo");

            }
        }
    }
}
