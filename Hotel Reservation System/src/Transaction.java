
public class Transaction {

	private int tId;
	private int cId;
	private int rId;
	private int amount;
	private int ccn;
	private String eDate;
	
	public int getTId(){
		return tId;
	}
	
	public void setTId(int id){
		tId = id;
	}
	
	public int getCId(){
		return cId;
	}
	
	public void setCId(int id){
		cId = id;
	}
	
	public int getRId(){
		return rId;
	}
	
	public void setRId(int id){
		rId = id;
	}
	
	public int getAmount(){
		return amount;
	}
	
	public void setAmount(int amount){
		this.amount = amount;
	}
	
	public int getCCN(){
		return ccn;
	}
	
	public void setCCN(int ccn){
		this.ccn = ccn;
	}
	
	public String getEDate(){
		return eDate;
	}
	
	public void setEDate(String date){
		eDate = date;
	}
}
