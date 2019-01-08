
/**
 * 
 * @author acer
 *
 */
public class RestaMulti implements IResta, IMultiplicacion{
	
	Suma sm = new Suma();
	
	
	public double resta(double a, double b) {
		return a - b;
	}
	
	public double multiplicacion(double a, double b) {
		
		double r = 0;
		if((a<0 && b<0) || (a>0 && b>0)) {
			for (int i = 0; i < Math.abs(b); i++) {
				r = sm.suma(r, Math.abs(a));
			}
		}else {
			if (a<0 || b<0) {
				for (int i = 0; i < Math.abs(b); i++ ) {
					r = resta(r, Math.abs(a));
				}
			}
		}
		return r;
	}
	

}
