
public class NegativeDiameterException extends Exception {
	public NegativeDiameterException() {
		
	}

	@Override
	public String getMessage() {
		return " NegativeDiameterException [Diameter cannot be Negative]";
	}
	
}
