package stacktrace;

@SuppressWarnings("serial")
public class PistaException extends Exception {

	public PistaException(String message , Exception e) {
		super(message, e);
	}

}
