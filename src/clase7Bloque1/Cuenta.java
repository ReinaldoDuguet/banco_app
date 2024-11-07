package clase7Bloque1;

import java.util.ArrayList;
import java.util.List;

public abstract class Cuenta {
		protected double saldo;
	    protected String numeroCuenta;
	    protected List<Transaccion> historialTransacciones;
	    protected final int MAXTRX =50;
	    
	    
	    public Cuenta() {// constructor
	    	this.saldo = 0;
	        this.historialTransacciones = new ArrayList<>();
	    }

	    public void depositar(double cantidad) {
	    	saldo += cantidad;
	        agregarTransaccion("Deposito ", cantidad);
	    }

	    public void transferir(Cuenta destino, double cantidad) {
	        if (saldo >= cantidad) {
	            saldo -= cantidad;
	            destino.depositar(cantidad);
	            agregarTransaccion("Transferencia a " + destino.numeroCuenta, cantidad);
	        } else {
	            System.out.println("Saldo insuficiente");
	        }
	    }

	    protected void agregarTransaccion(String tipo, double cantidad) {
	        if (historialTransacciones.size() >= MAXTRX) {
	            historialTransacciones.remove(0);
	        }        
	        historialTransacciones.add(new Transaccion(tipo, cantidad));
	    }

	    public abstract void actualizarSaldoMensual();
	    
	    public void mostrarInformacion() {
	        System.out.println("Cuenta: " + numeroCuenta);
	        System.out.println("Saldo: " + saldo);
	        System.out.println("Historial de Transacciones:");
	        for (Transaccion transaccion : historialTransacciones) {
	            System.out.println(transaccion);
	        }
	    }
}
