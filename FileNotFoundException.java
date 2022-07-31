package filedbms;

public class FileNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;
	 
	 FileNotFoundException(String message) {
		 this.message=message;
		 
	 }
	 
	 @Override
	 public String getMessage() {
		 return message;
	 }

		 
}
