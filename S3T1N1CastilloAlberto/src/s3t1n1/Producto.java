package s3t1n1;

public class Producto {
	
	private static int cont=1;
	private int id;
	private  String  nombre;

	public Producto(String nombre) {		
			this.nombre = nombre;
			this.id = cont;	
			if(cont>=1) {
				Producto.cont= cont+1;
			}
			
				
	}

	public String getNombre() {
		return nombre;
	}

	public void setDescripcion(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "ID: "+id+"  producto: " + nombre ;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
		
 
	public static void resCont() {
		cont = cont -1;
	}
	
}
