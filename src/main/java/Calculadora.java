import java.util.Scanner;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;

/**
 * Calculadora.
 * @author CltControl
 *
 */
public class Calculadora {
	
	
	
	/**
	 * Main
	 * @param args
	 */
	public static void main(String[] args) {
		
		RestaMulti rm = new RestaMulti();
		Potencia p = new Potencia();
		Division d = new Division();
		
		System.out.println("1) Suma");
		System.out.println("2) Resta");
		System.out.println("3) Multiplicacion");
		System.out.println("4) Division");
		System.out.println("5) Potencia");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Que operacion desea realizar: ");
			String opcion = sc.nextLine();
			double resultado;
			double x , y;
			switch (opcion) {
			case "1":
				System.out.println("(x + y)");
				System.out.print("Ingrese x : ");
				try {
					x = sc.nextDouble();
				} catch (NumberFormatException e) {
					System.out.print("No es un numero");
					return;
				}
				System.out.print("Ingrese y : ");
				try {
					y  = sc.nextDouble();
					Suma s = new Suma();
					resultado = s.suma(x , y);
					System.out.print("Resultado : " +resultado);
				} catch (NumberFormatException e) {
					System.out.print("No es un numero");
					return;
				}
				
	
				break;
			case "2":
				System.out.println("(x - y)");
				System.out.print("Ingrese x : ");
				try {
					x = sc.nextDouble();
				} catch (NumberFormatException e) {
					System.out.print("No es un numero");
					return;
				}
				System.out.print("Ingrese y : ");
				try {
					y  = sc.nextDouble();
					resultado = rm.resta(x , y);
					System.out.print("Resultado : " +resultado);
				} catch (NumberFormatException e) {
					System.out.print("No es un numero");
					return;
				}
				
				 
				break;
			case "3":
				System.out.println("(x * y)");
				System.out.print("Ingrese x : ");
				try {
					x = sc.nextDouble();
				} catch (NumberFormatException e) {
					System.out.print("No es un numero");
					return;
				}
				System.out.print("Ingrese y : ");
				try {
					y  = sc.nextDouble();
					resultado = rm.multiplicacion(x , y);
					System.out.print("Resultado : " +resultado);
				} catch (NumberFormatException e) {
					System.out.print("No es un numero");
					return;
				}
				
				break;
			case "4":
				System.out.println("(x / y)");
				System.out.print("Ingrese x : ");
				try {
					x = sc.nextDouble();
				} catch (NumberFormatException e) {
					System.out.print("No es un numero");
					return;
				}
				System.out.print("Ingrese y : ");
				try {
					y  = sc.nextDouble();
					resultado = d.division(x , y);
					System.out.print("Resultado : " +resultado);
				} catch (NumberFormatException e) {
					System.out.print("No es un numero");
					return;
				}
				break;
			case "5":
				System.out.println("(x ^ y)");
				System.out.print("Ingrese x : ");
				try {
					x = sc.nextDouble();
				} catch (NumberFormatException e) {
					System.out.print("No es un numero");
					return;
				}
				System.out.print("Ingrese y : ");
				try {
					y  = sc.nextDouble();
					resultado = p.potencia(x , y);
					System.out.print("Resultado : " +resultado);
				} catch (NumberFormatException e) {
					System.out.print("No es un numero");
					return;
				}
				break;
			default:
				System.out.print("No es una opcion v�lida");
				break;
			}
			System.out.println("");
			sc.nextLine();
		}
	}	
}
