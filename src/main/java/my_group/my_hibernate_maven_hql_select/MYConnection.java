package my_group.my_hibernate_maven_hql_select;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
public class MYConnection {
	public static Session getSession() {
		return new Configuration().
				configure("hibernate.cfg.xml").
				buildSessionFactory().
				openSession();
	}
}
