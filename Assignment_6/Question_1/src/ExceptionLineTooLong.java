
public class ExceptionLineTooLong extends Exception {
	private String longLength;
	public ExceptionLineTooLong() {
	}
	
	public String getLongLength() {
		return longLength;
	}

	@Override
	public String getMessage() {
		
		return "The string too long";
	}
}

