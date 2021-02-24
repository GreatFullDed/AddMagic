/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moduls;

import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author WSR
 */
public class Hiber {

    private static final SessionFactory sessionFactory;
    public static Session sess;
    private static Transaction tr;
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    public static void start(){
        sess=sessionFactory.openSession();
    }
    
    public static void close(){
        sess.close();
        sessionFactory.close();
    } 
    
    public static void save(Object o){
        try {
            tr=sess.beginTransaction();
            sess.save(o);
            tr.commit();
            System.out.println("Всё хорошо");
        } catch (Exception e) {
            tr.rollback();
            System.out.println("Всё плохо");
        }
    }
    public static void delete(Object o){
        try {
            tr=sess.beginTransaction();
            sess.delete(o);
            tr.commit();
            System.out.println("Всё хорошо");
        } catch (Exception e) {
            tr.rollback();
            System.out.println("Всё плохо");
        }
    }
    
}
