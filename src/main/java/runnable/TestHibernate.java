package runnable;

import entities.UsersEntity;
import org.hibernate.Session;
import persistence.HibernateUtil;

public class TestHibernate {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        // Add new Employee object
        UsersEntity emp = new UsersEntity();
        emp.setUsername("userfirst");

        session.save(emp);

        session.getTransaction().commit();
        HibernateUtil.shutdown();
    }
}
