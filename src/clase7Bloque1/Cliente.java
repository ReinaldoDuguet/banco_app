package clase7Bloque1;

public class Cliente {
	 	private String nombre;
	    private String rut;
	    private CuentaCorriente cuentaCorriente;
	    private CuentaAhorro cuentaAhorro;

	    public Cliente(String nombre, String rut) {
	        this.nombre = nombre;
	        this.rut = rut;
	        this.cuentaCorriente = new CuentaCorriente();
	        this.cuentaAhorro = new CuentaAhorro();
	    }

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getRut() {
			return rut;
		}

		public void setRut(String rut) {
			this.rut = rut;
		}

		public CuentaCorriente getCuentaCorriente() {
			return cuentaCorriente;
		}

		public void setCuentaCorriente(CuentaCorriente cuentaCorriente) {
			this.cuentaCorriente = cuentaCorriente;
		}

		public CuentaAhorro getCuentaAhorro() {
			return cuentaAhorro;
		}

		public void setCuentaAhorro(CuentaAhorro cuentaAhorro) {
			this.cuentaAhorro = cuentaAhorro;
		}

}
