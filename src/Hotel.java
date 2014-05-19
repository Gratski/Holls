
public class Hotel {

	private String name;
	private int rate;
	private int capacity;
	private int taken;
	
	//room numbers and prices
	private Room[]rooms;
	
	//geolocation
	private Coordinates coord;
	
	public Hotel(String json){
		//receives a string wich is the json object
		//interpret it
		//initialize all variables
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Hotel: "+this.name+"\n");
		sb.append("Rate: "+this.rate+"\n");
		sb.append("Capacity: "+this.capacity+"\n");
		sb.append("Rooms available: "+(this.capacity - this.taken)+"\n");
		sb.append("Coordinates: "+this.coord.getLat()+" , "+this.coord.getLng()+"\n");
		return sb.toString();
	}
	
}
