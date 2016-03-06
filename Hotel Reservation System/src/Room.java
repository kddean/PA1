
public class Room {

	private String type;
	private int price;
	private int currentO;
	private int number;
	
	public String getRoomType(){
		return type;
	}
	
	public void setRoomType(String type){
		this.type = type;
	}
	
	public int getRoomPrice(){
		return price;
	}
	
	public void setRoomPrice(int price){
		this.price = price;
	}
	
	public int getCurrentO(){
		return currentO;
	}
	
	public void setCurrentO(int currentO){
		this.currentO = currentO;
	}
	
	public int getRoomNumber(){
		return number;
	}
	
	public void setRoomNumber(int number){
		this.number = number;
	}
}
