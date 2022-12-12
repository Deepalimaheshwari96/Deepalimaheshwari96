package exceptionhandling.program4;


public class ItemPurchaseLimitExceed extends Exception{

	private static final long serialVersionUID = 1L;
	
	public ItemPurchaseLimitExceed(String str) {
		super(str);
	}
	

}
