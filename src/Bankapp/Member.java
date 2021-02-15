package Bankapp;

public class Member {
	@Override
	public String toString() {
		return "Member [num = " + num + ", name=" + name + ", id=" + id + ", pw=" + pw + ", Balance=" + Balance + "]";
	}
	private String num;
	private String name; 
	private String id;
	private String pw;
	private int Balance;
	
	public Member() { }
	public Member(String num, String name, String id, String pw, int balance) {
		this.num= num;
		this.name = name;
		this.id = id;
		this.pw = pw; 
		this.Balance = balance; 
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int balance) {
		this.Balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
			
	

}
