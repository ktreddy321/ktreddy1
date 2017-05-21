import java.util.UUID;

public class a {
	static void a1(){
	UUID uid;
	uid=UUID.randomUUID();
	System.out.println(uid);
	StringBuilder b=new StringBuilder(uid.toString());
	String data=b.substring(0,6);
	System.out.println(data);
}
	public static void main(String[] args) {
		a.a1();
	}
}
