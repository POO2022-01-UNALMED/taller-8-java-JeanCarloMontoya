package futbol;
import java.lang.Comparable;
public class Futbolista implements Comparable<Futbolista>{
	 private String nombre;
	 private int edad;
	 private String posicion;
	 
	 public Futbolista(String nombre, int edad, String posicion) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}
	public Futbolista() {
		super();
		this.nombre = "Maradona";
		this.edad = 30;
		this.posicion = "delantero";
	}
	 public String toString() {
		 return "El futbolista "+nombre+" tiene "+edad+ ", y "
		 		+ "juega de "+posicion;
	 }
	 public boolean jugarConLasManos() {return false;};
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public int compareTo(Futbolista o) {
		return 0;
	}; 

		
	
	
}
