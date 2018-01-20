package achmad.rifai.JejakPengguna;

import org.mortbay.jetty.Connector;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.bio.SocketConnector;
import org.mortbay.jetty.webapp.WebAppContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	hibernateTest();
    }

	private static void hibernateTest() {
		/*org.hibernate.Session s=config.Hibernate.newSession().openSession();
    	org.hibernate.Transaction t=s.beginTransaction();
    	entity.Pengguna p=new entity.Pengguna();
    	p.setKode("aku");
    	p.setPass("oke");
    	p.setNama("Rifa'i");
    	p.setLoggedin(false);
    	s.save(p);
    	t.commit();
    	s.close();*/
    	showHibernate();
	}

	@SuppressWarnings("unchecked")
	private static void showHibernate() {
		org.hibernate.Session s=config.Hibernate.newSession().openSession();
    	org.hibernate.Transaction t=s.beginTransaction();
    	java.util.List<entity.Pengguna>l=s.createQuery("from entity.Pengguna").list();
    	for(entity.Pengguna p:l) {
    		System.out.println("Kode : "+p.getKode());
    		System.out.println("Nama : "+p.getNama());
    		System.out.println("Password : "+p.getPass());
    		System.out.println("Masuk : "+p.getLoggedin());
    		System.out.println();
    	}t.commit();
    	s.close();
	}

	private static void webServer() {
		Server s=null;try {
        	s=new Server();
        	SocketConnector sc=new SocketConnector();
        	sc.setPort(2101);
        	s.setConnectors(new Connector[] {sc});
        	WebAppContext wac=new WebAppContext();
        	wac.setContextPath("/");
        	wac.setWar("src/main/webapp");
        	s.setHandler(wac);
        	s.start();
        }catch(Exception e) {
        	if(s!=null)
				try {
					s.stop();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
        }
	}
}
