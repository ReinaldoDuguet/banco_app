package clase7Bloque1;

public class BancoApp {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Juan Pérez", "12345678-9");
        cliente1.getCuentaCorriente().depositar(1000);
        cliente1.getCuentaCorriente().transferir(cliente1.getCuentaAhorro(), 200);
        cliente1.getCuentaCorriente().actualizarSaldoMensual();
        
        cliente1.getCuentaCorriente().mostrarInformacion();
        cliente1.getCuentaAhorro().mostrarInformacion();
	}

}
