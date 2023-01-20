package edu.itstep.sql;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateOps {
  public static void main(String...arg){
      StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
      Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
      SessionFactory factory = meta.getSessionFactoryBuilder().build();
      Session session = factory.openSession();
      Transaction t = session.beginTransaction();
      Users user1 = new Users();
      user1.setId(100);
      user1.setUser_name("user101");
      user1.setPassword("test");
      session.save(user1);
      t.commit();
      factory.close();
      session.close();

  }
}
