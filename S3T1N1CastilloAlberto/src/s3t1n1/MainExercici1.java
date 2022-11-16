package s3t1n1;

public class MainExercici1 {

	public static void main(String[] args) {

		// opciones
		boolean sortir = false;
		do {
			switch (menu()) {
			case 1:
				String nombreProducto = Entrada.leerString("Introduce el nombre del producto");
				Producto producto = new Producto(nombreProducto);
				Undo lista = Undo.getUndoInstancia();
				lista.addList(producto.getId(), producto.getNombre());
				break;
			case 2:
				Undo.listar();
				break;
			case 3:
				Undo.eliminar();
				Producto.resCont();
				break;
			case 0:
				Entrada.escribir("Gracias por utilizar la aplicación");
				sortir = true;
				break;
			default:
				System.err.println("ERROR");
				break;
			}
		} while (!sortir);

	}

// Menu
	public static byte menu() {

		byte opcio;
		final byte MINIMO = 0;
		final byte MAXIMO = 3;

		do {
			Entrada.escribir("\nMENú PRINCIPAL");
			Entrada.escribir("0. Salir de la aplicacion ");
			Entrada.escribir("1. add producto");
			Entrada.escribir("2. Listar");
			Entrada.escribir("3. Undo");
			opcio = Entrada.leerByte("Escoje una opción");

			Entrada.vaciarBuffer();
			if (opcio < MINIMO || opcio > MAXIMO) {
				Entrada.escribir("Escoje una opción valida");
			}
		} while (opcio < MINIMO || opcio > MAXIMO);
		return opcio;

	}

}
