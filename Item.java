package inventory_management;

public class Item {
	private String name,
					description,
					image_src;
	private int id,
				count;
	private boolean in_stock;
	private double cost;
	
	// Constructor Method
	public Item(int id_val, String name_val) {
		name = name_val;
		id = id_val;
		
		description = "";
		image_src = "";
		count = 0;
		in_stock = false;
		cost = 0;
	}
	
	// Set Methods
	public void set_name(String str) {
		name = str;
	}
	
	public void set_description(String str) {
		description = str;
	}
	
	public void set_image_src(String str) {
		image_src = str;
	}
	
	public void set_id(int num) {
		id = num;
	}
	
	public void set_count(int num) {
		count = num;
	}
	
	public void increment_count(int num) {
		count += num;
	}
	
	public void decrement_count(int num) {
		count -= num;
	}
	
	public void set_in_stock(boolean bool) {
		in_stock = bool;
	}
	
	public void set_cost(double num) {
		cost = num;
	}
	
	// Get Methods
	public String get_name() {
		return name;
	}
	
	public String get_description() {
		return description;
	}
	
	public String get_image_src() {
		return image_src;
	}
	
	public int get_id() {
		return id;
	}
	
	public int get_count() {
		return count;
	}
	
	public boolean get_in_stock() {
		return in_stock;
	}
	
	public double get_cost() {
		return cost;
	}
	
}
