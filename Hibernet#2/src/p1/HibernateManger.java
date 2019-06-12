package p1;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import java.util.*;
public class HibernateManger
{
	Session session;
	private List List;
	
	public void connect()
	{
	//Connection code
		// these 5 lines would remain same and is used for getting connection
       Configuration configuration = new Configuration().configure("hibernate.cfg.xml"); //connects to cfg
       ServiceRegistryBuilder builder = new ServiceRegistryBuilder().applySettings(configuration.getProperties());
       SessionFactory sessionFactory = configuration.buildSessionFactory(builder.buildServiceRegistry());       		   
          		 
        session =sessionFactory.openSession();	
        System.out.println("Connected to Pf....");
	}
	
	public void select(Student2 s2)
	{
		session.beginTransaction();
		Query q=session.createQuery("From Student2");// we are write from class name 
		List l=q.list();
		Iterator itr=l.iterator();
		while(itr.hasNext()==true)
		{
		Student2 s	=(Student2) itr.next();// we are using classs name as Student2
		System.out.println(s.getSid()+" "+s.getSname());
		}
		
		
	}
	

}
