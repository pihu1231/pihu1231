package playermgmt;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//Main class
public class Player {

   // Main driver method
   public static void main(String[] args)
   {

       // Create Configuration
       Configuration configuration = new Configuration();
       configuration.configure("hibernate.cfg.xml");
       configuration.addAnnotatedClass(PlayerInfo.class);

       // Create Session Factory
       SessionFactory sessionFactory = configuration.buildSessionFactory();

       // Initialize Session Object
       Session session = sessionFactory.openSession();

       PlayerInfo pl1 = new PlayerInfo();

       pl1.setId(1);
       pl1.setPlayerName("Meena");
       pl1.setGroup("Hockey");

       session.beginTransaction();

       // Here we have used
       // save() method of JPA
       session.save(pl1);

       session.getTransaction().commit();
   }
}