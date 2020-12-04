package modelo;

import java.util.List;

public class LibroImpreso extends Libro {

	@Override
	public double calcularComision() {
		// TODO Auto-generated method stub	
		double comision=(this.getPrecio()*0.02)+20;
		return comision;
	}

	
	
}