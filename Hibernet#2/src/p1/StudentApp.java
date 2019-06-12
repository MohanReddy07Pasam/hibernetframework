package p1;

public class StudentApp {

	public static void main(String[] args) {
		
		Student2 s2=new Student2();
		HibernateManger hm =new HibernateManger();
		hm.connect();
		hm.select(s2);

	}

}
