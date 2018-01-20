package config;

public class Hibernate {
	public static org.hibernate.SessionFactory newSession(){
		org.hibernate.cfg.Configuration c=new org.hibernate.cfg.Configuration();
		c.configure("hibernate.cfg.xml");
		org.hibernate.service.ServiceRegistry sr=new org.hibernate.boot.registry.
				StandardServiceRegistryBuilder().applySettings(c.getProperties()).build();
		return c.buildSessionFactory(sr);
	}
}