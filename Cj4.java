package project;

public class Cj4 {
String name;
static int id;
String address;
       public Cj4(String name,int id,String address) {
         this.name=name;
         this.id=id;
         this.address=address;
       }
	public static void main(String[] args) {
		Cj4 c1=new Cj4("anu",34,"bglr");
        System.out.println(c1.name);
        System.out.println(c1.id);
        System.out.println(c1.address);

	}

}
