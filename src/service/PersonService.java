package service;

import common.JPA;
import entity.Car;
import entity.Jet;
import entity.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonService {
    public static void save1() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("J2OS");//SESSION FACTORY
        EntityManager manager = factory.createEntityManager();//SESSION
        EntityTransaction transaction = manager.getTransaction();//TRANSACTION
        transaction.begin();

        Person person = new Person().setName("Amirsam").setFamily("Bahador");
        manager.persist(person);

        transaction.commit();
        manager.close();
        System.out.println(person.getPersonId());
    }

    public static void save2() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("J2OS");//SESSION FACTORY
        EntityManager manager = factory.createEntityManager();//SESSION
        EntityTransaction transaction = manager.getTransaction();//TRANSACTION
        transaction.begin();

        Person person1 = new Person().setName("Amirsam").setFamily("Bahador");
        Person person2 = new Person().setName("Amirsam2").setFamily("Bahador2");

        Car car = new Car().setModel("BMW");
        Jet jet = new Jet().setName("F-140");
        manager.persist(jet);
        manager.persist(car);
        manager.persist(person1);
        manager.persist(person2);

        transaction.commit();
        manager.close();

    }
    public static void find(){
        EntityManager manager = JPA.getEntityManager();
        Person person1 = manager.find(Person.class , 3L);
        Person person2 = manager.find(Person.class , 4L);
        Person person3 = manager.find(Person.class , 3L);
        manager.close();
        System.out.println(person1.getPersonId());
        System.out.println(person2.getName());
        System.out.println(person3.getFamily());
    }
    public static void main(String[] args) {
        find();
    }
}
