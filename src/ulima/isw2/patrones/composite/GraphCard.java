package ulima.isw2.patrones.composite;

import java.util.ArrayList;
import java.util.List;

public class GraphCard implements Componente{
	List<Componente> componentes;
	
	public GraphCard() {
		componentes = new ArrayList<Componente>();
		componentes.add(new GraphMemory());
		componentes.add(new GPU());
		componentes.add(new BusGrafico());
	}

	@Override
	public double darPrecio() {
		double precioTotal = 0;
		
		for (int i=0; i<componentes.size(); i++){
			precioTotal += componentes.get(i).darPrecio();
		}
		
		return precioTotal;
	}
	
	public void addComponente(Componente componente){
		componentes.add(componente);
	}

}
