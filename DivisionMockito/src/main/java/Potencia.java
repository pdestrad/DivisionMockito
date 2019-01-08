
/*import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;
*/
public class Potencia implements IPotencia{
	
	/**
	 * Funcion Potencia
	 * @param x: base
	 * @param y: exponente
	 * @return x^y
	*/ 
	@Override
	public double potencia(double x, double y) {
		
		double r = 1;
		double exp = Math.abs(y);
		
		RestaMulti rm = new RestaMulti();
		
		if (x == 0){
			return 0.0;
		}
		
		if (y == 0) {
			return 1.0;
		}
		
		for (int i = 0; i < exp; i++) {
			r = rm.multiplicacion(r, x);
		}
		
		if (y > 0) {
			return r;
		} else {
			return 1/r;
		}
		
	}
	
}
