public class Division implements IDivision {

	static Suma suma;
	static RestaMulti restamulti;
	
	@Override
	public double division(double x, double y) {
		if (x != 0) {
			suma = new Suma();
			restamulti = new RestaMulti();
			
			double signo = 1;
			double xABS = Math.abs(x);
			double yABS = Math.abs(y);
			double acumulado = yABS;
			double contador = 0;
			while (xABS >= acumulado) {
				acumulado = suma.suma(acumulado, yABS);
				contador = suma.suma(contador, 1);
			} 
			if (x < 0) {signo = restamulti.multiplicacion(signo, -1); }
			if (y < 0) {signo = restamulti.multiplicacion(signo, -1); }
				
			return restamulti.multiplicacion(contador, signo);
		}
		return 0.0;
	}
	
}
