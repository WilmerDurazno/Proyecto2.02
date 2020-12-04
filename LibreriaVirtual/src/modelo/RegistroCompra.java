package modelo;

import java.util.ArrayList;
import java.util.List;

public class RegistroCompra {
	
	private List<Factura> facturalist;

	public RegistroCompra() {
		this.facturalist= new ArrayList<Factura>();
		
		// TODO Auto-generated constructor stub
	}

	public void guardarCompra(Factura f) {
		this.facturalist.add(f);
	}
	
	
	public List<Factura> getFacturalist() {
		return facturalist;
	}

	public void setFacturalist(List<Factura> facturalist) {
		this.facturalist = facturalist;
	}

	@Override
	public String toString() {
		return "RegistroCompra [facturalist=" + facturalist + "]";
	}
	
	

}
