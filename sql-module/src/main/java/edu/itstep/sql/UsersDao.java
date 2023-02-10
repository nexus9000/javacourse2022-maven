package edu.itstep.sql;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

public class UsersDao {
    @PersistenceContext
    private static EntityManager em;

    public static List<Users> findAll(){

        return em.createQuery("SELECT u FROM Users u").getResultList();
    }
}
