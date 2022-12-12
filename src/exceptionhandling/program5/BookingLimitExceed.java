package exceptionhandling.program5;

public class BookingLimitExceed extends Exception{

	private static final long serialVersionUID = 1L;

	public BookingLimitExceed(String str) {
		super(str);
	}

}
