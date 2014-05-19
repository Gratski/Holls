
public class Room {

	private int capacity;
	private double price;	
	//1 if it has, 0 if it doesnt
	private int bathroom;
	
	public Room(int capacity, int price, int bathroom){
		this.capacity = capacity;
		this.price = price;
		this.bathroom = bathroom;
	}
	
	public int getCapacity() {
		return capacity;
	}
	public double getPrice() {
		return price;
	}
	public int getBathroom() {
		return bathroom;
	}
	
	
	
}
