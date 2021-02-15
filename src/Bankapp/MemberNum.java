package Bankapp;

public class MemberNum {
	@Override
	public String toString() {
		return "Member [num = " + num + ", id=" + id + "]";
	}
	private int num;
	
	private String id;
	
	public MemberNum() { }
	public MemberNum(int num,String id) {
		this.num= num;
		
		this.id = id;
	
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
			
	

}
