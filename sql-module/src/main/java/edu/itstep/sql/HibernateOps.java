package edu.itstep.sql;


import jakarta.persistence.EntityManager;

import org.hibernate.SessionFactory;

import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;



import java.util.List;



public class HibernateOps {

  public static void main(String...arg){

      StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
      Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
      SessionFactory factory = meta.getSessionFactoryBuilder().build();
//      Session session = factory.openSession();
//      Transaction t = session.beginTransaction();
//      String salt = BCrypt.gensalt();
//      String password = "test";//get by user
//      String hashPassw = BCrypt.hashpw(password,salt);
//      Users user1 = new Users("user105",hashPassw);
//     // session.persist(user1);
//      t.commit();
//      factory.close();
//      session.close();
      EntityManager em = factory.createEntityManager();
      em.getTransaction().begin();
      List<Users> result = em.createQuery("from Users").getResultList();
      System.out.println("##################################################");
      for (Users user : result){
          System.out.println(user.getUserName() + " "+ user.getPassword());
      }
      em.getTransaction().commit();
      em.close();
//      List<Users> users = UsersDao.findAll();
//      users.forEach(p->System.out.println(p));
  }
}
