package hibernet;

public class StudentApp {

	public static void main(String[] args) {
	
		Student1 s=new Student1();
		s.setSid("1");
		s.setSname("mohan");
		HibernetManger hm=new HibernetManger();
		hm.connect();
		hm.insert(s);

	}

}
