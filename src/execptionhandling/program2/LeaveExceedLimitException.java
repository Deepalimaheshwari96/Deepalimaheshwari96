package execptionhandling.program2;

public class LeaveExceedLimitException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public LeaveExceedLimitException(String str) {
		super(str);
	}
}

