package net.surfm.pojokv;

public class NotFindKeyException extends RuntimeException {

	public NotFindKeyException() {
		super();
	}

	public NotFindKeyException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public NotFindKeyException(String message, Throwable cause) {
		super(message, cause);
	}

	public NotFindKeyException(String message) {
		super(message);
	}

	public NotFindKeyException(Throwable cause) {
		super(cause);
	}
	

}
