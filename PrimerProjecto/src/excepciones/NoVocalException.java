package excepciones;

public class NoVocalException extends Exception {

	private static final long serialVersionUID = 1L;

	public NoVocalException() {
        super("La letra no es una vocal.");
    }
}