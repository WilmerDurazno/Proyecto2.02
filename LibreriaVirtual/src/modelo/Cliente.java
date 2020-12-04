package modelo;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private String cedula;
	private String telefono;
	private double credito;

	
	public Cliente(String nombre, String apellido, String cedula, String telefono, double credito) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.telefono = telefono;
		this.credito = credito;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public double getCredito() {
		return credito;
	}
	public void setCredito(double credito) {
		this.credito = credito;
	}
	
	public double disminuirCredito(double dis) {
		double nuevoCredito = this.getCredito()-dis;
		this.setCredito(nuevoCredito);
		return nuevoCredito;
	}
	
	public double recargarCredito(double dis) {
		double nuevoCredito = this.getCredito()+dis;
		this.setCredito(nuevoCredito);
		return nuevoCredito;
	}
	
	public String recuperaCompras(Cliente cliente,RegistroCompra r) {
		
		System.out.println(cliente.toString());
		String s="";
		for (int i = 0; i < r.getFacturalist().size(); i++) {
			if (r.getFacturalist().get(i).getCliente().getCedula().equals(cliente.getCedula())) {
				
				if (r.getFacturalist().get(i).getDigital()==null) {
					s+=" Id factura: "+r.getFacturalist().get(i).getId_factura()+r.getFacturalist().get(i).getFisico().toString()+" cantidad:"+r.getFacturalist().get(i).getCantidad()+" Comision:"+r.getFacturalist().get(i).getFisico().calcularComision()+"total: "+r.getFacturalist().get(i).getTotal_venta()+"\n";
				}else {
					s+=" Id factura: "+r.getFacturalist().get(i).getId_factura()+r.getFacturalist().get(i).getDigital().toString()+" cantidad:"+r.getFacturalist().get(i).getCantidad()+" Comision:"+r.getFacturalist().get(i).getDigital().calcularComision()+" total: "+r.getFacturalist().get(i).getTotal_venta()+"\n";
				}
				
			}
		}
		return s;
		
	}
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", telefono=" + telefono
				+ ", credito=" + credito + "]";
	}
	
	
	
	
	
	
	
	




}
