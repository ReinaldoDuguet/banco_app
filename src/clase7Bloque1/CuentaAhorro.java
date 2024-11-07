package clase7Bloque1;

public class CuentaAhorro extends Cuenta {
    private static final double RENTABILIDAD = 0.02;

    @Override
    public void actualizarSaldoMensual() {
        double totalDepositos = historialTransacciones.stream()
                .filter(t -> t.tipo.equals("Depósito"))
                .mapToDouble(t -> t.cantidad)
                .limit(5)
                .sum();
        saldo += totalDepositos * RENTABILIDAD;
    }

    @Override
    public void transferir(Cuenta destino, double cantidad) {
        double penalizacion = cantidad * 0.02;
        if (saldo >= (cantidad + penalizacion)) {
            saldo -= (cantidad + penalizacion);
            destino.depositar(cantidad);
            agregarTransaccion("Transferencia con penalización a " + destino.numeroCuenta, cantidad);
        } else {
            System.out.println("Saldo insuficiente para cubrir la transferencia y la penalización");
        }
    }
}