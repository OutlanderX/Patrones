package ulima.isw2.patrones.composite;

public class Computadora implements Componente{
	private CPU cpu;
	private GraphCard graphCard;
	private Keyboard keyboard;
	private Memory memory;
	private Monitor monitor;
	
	public Computadora() {
		cpu = new CPU();
		graphCard = new GraphCard();
		keyboard = new Keyboard();
		memory = new Memory();
		monitor = new Monitor();
	}
	
	@Override
	public double darPrecio() {
		double precioTotal = cpu.darPrecio() + graphCard.darPrecio() +
				keyboard.darPrecio() + memory.darPrecio() + monitor.darPrecio();

		return precioTotal;
	}

}
