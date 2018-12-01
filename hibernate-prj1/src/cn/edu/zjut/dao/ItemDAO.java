package cn.edu.zjut.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


import java.util.List;

public class ItemDAO {
    private static final Log log = LogFactory.getLog(ItemDAO.class);

    public List findAll(){

        log.debug("finding all Item instances");

        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();

        try {
            String queryString = "from Item";
            Query queryObject = session.createQuery(queryString);
            return queryObject.list();
        } catch (RuntimeException re) {
            log.error("findAll failed",re);
            throw re;
        } finally {
            session.close();
        }


    }




}
