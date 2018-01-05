package inventory_management;
import java.util.Date;

public class Order {

	private Item[] items;
	private int order_number;
	private Date timestamp;
	private User client;
		
	public void set_items(Item[] items_val) {
		items = items_val;
	}
	
	public void set_order_number(int num) {
		order_number = num;
	}
	
	public void set_timestamp() {
		timestamp = new Date();
	}
	
	public void set_client(User user) {
		client = user;
	}
	
	public Item[] get_items() {
		return items;
	}
	
	public int get_order_number() {
		return order_number;
	}
	
	public Date get_timestamp() {
		return timestamp;
	}
	
	public User get_client() {
		return client;
	}
}
