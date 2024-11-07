package clase7Bloque1;

import java.time.LocalDateTime;

public class Transaccion {
	    String tipo; //deposito, transferencia, 
	    double cantidad;
	    private LocalDateTime fecha;

	    public Transaccion(String tipo, double cantidad) {
	    	super();
	    	LocalDateTime fecha = LocalDateTime.now();
	    	this.tipo = tipo;
			this.cantidad = cantidad;
			this.fecha = fecha;
		}

		@Override
		public String toString() {//valores de los atributos
			return "Transaccion [tipo=" + tipo + ", cantidad=" + cantidad + ", fecha=" + fecha + "]";
		}
		
}
