package clase7Bloque1;

public class CuentaCorriente extends Cuenta {
	private static final double COSTO_MANTENCION = 5.0;

    @Override
    public void actualizarSaldoMensual() {
        saldo -= COSTO_MANTENCION;
    }

    @Override
    public void transferir(Cuenta destino, double cantidad) {
        double costoTransferencia = cantidad * 0.05;
        if (saldo >= (cantidad + costoTransferencia)) {
            saldo -= (cantidad + costoTransferencia);
            destino.depositar(cantidad);
            agregarTransaccion("Transferencia con costo a " + destino.numeroCuenta, cantidad);
        } else {
            System.out.println("Saldo insuficiente para cubrir la transferencia y el costo de administración");
        }
    }
}
