package project;

public class Emp {
	int id;  
	String name;  
    String  address;  
	  
	public Emp(int id, String name,String address) {  
	    this.id = id;  
	    this.name = name;  
	    this.address=address;  
	}  
	  
	void display(){  
	System.out.println(id+" "+name);  
 	}  
	  
	public static void main(String[] args) {  
		Aggregation address1=new Aggregation("bglr","AP","india");  
		Aggregation address2=new Aggregation("hyd","Telangana","india");  
	                   Emp e=new Emp(111,"varun","bglr");  
	                       e.display();  
	 
	}	     
}
