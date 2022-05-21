package futbol;

public class Portero extends Futbolista{
	public short golesRecibidos;
	public byte dorsal;
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}
	public boolean jugarConLasManos() {
		return true;
	}
	public int compareTo(Futbolista o) {
		return java.lang.Math.abs(((Portero)o).golesRecibidos-this.golesRecibidos);
		
	}
	public String toString() {
		return "El futbolista "+this.getNombre()+
				" tiene "+this.getEdad()+ ", y juega de "+this.getPosicion()+
				" con el dorsal "+dorsal+ ".Le han marcado"+golesRecibidos;
	}
	
}
