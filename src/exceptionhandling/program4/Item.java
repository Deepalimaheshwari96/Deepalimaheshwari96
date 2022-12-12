package exceptionhandling.program4;

public class Item {

	private String item_name; 
	private long price;
	private int maximum_no_of_item;
	private int itemid;
	
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public int getMaximum_no_of_item() {
		return maximum_no_of_item;
	}
	public void setMaximum_no_of_item(int maximum_no_of_item) {
		this.maximum_no_of_item = maximum_no_of_item;
	}
}
