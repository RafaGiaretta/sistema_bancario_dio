package entities.exceptions;

public class Exception extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public Exception (String msg) {
		super(msg);
	}
}
