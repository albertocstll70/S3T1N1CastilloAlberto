package s3t1n1;

import java.util.concurrent.ConcurrentHashMap;

public class Undo {

	private static Undo undoInstacia = null;

	private static ConcurrentHashMap<Integer, String> list = null;

	private Undo() {

	}

	public static Undo getUndoInstancia() {

		if (undoInstacia == null) {
			undoInstacia = new Undo();
		}
		return undoInstacia;

	}

	public void addList(Integer id, String nombre) {
		if (list == null) {
			list = new ConcurrentHashMap<Integer, String>();
		}

		list.put(id, nombre);

	}

	public static void eliminar() {

		list.remove(list.size());

	}

	public static void listar() {
		list.forEach((i, p) -> System.out.println("ID: " + i + " " + p));

	}

}
