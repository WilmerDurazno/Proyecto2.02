package modelo;

public class Factura {

	private int id_factura;
	private double precio_unitario;
	private int cantidad;
	private double total_venta;
	private LibroImpreso fisico;
	private LibroDigital digital;
	private Cliente cliente;
	
	public Factura() {
		super();
	}

	public int getId_factura() {
		return id_factura;
	}

	public void setId_factura(int id_factura) {
		this.id_factura = id_factura;
	}

	public double getPrecio_unitario() {
		return precio_unitario;
	}

	public void setPrecio_unitario(double precio_unitario) {
		this.precio_unitario = precio_unitario;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getTotal_venta() {
		return total_venta;
	}

	public void setTotal_venta(double total_venta) {
		this.total_venta = total_venta;
	}

	public LibroImpreso getFisico() {
		return fisico;
	}

	public void setFisico(LibroImpreso fisico) {
		this.fisico = fisico;
	}

	public LibroDigital getDigital() {
		return digital;
	}

	public void setDigital(LibroDigital digital) {
		this.digital = digital;
	}
	
	
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void calcularTotal(double punit, int cant) {
		double n=0;
		double total=0;
		if (this.digital==null) {
			n=this.fisico.calcularPrecio();	
			System.out.println("comision impreso"+n);
			
		} else {
			n=this.digital.calcularPrecio();
			System.out.println("comision digital"+n);
		}
		
		total=n*cant;
		this.setTotal_venta(total);
		this.cliente.disminuirCredito(this.getTotal_venta());
	}

	@Override
	public String toString() {
		return "Factura [id_factura=" + id_factura + ", precio_unitario=" + precio_unitario + ", cantidad=" + cantidad
				+ ", total_venta=" + total_venta + ", fisico=" + fisico + ", digital=" + digital + ", cliente="
				+ cliente + "]";
	}


		
	
	
	
}
