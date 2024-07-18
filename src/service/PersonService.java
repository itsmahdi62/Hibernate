package service;

import entity.Car;
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

        manager.persist(car);
        manager.persist(person1);
        manager.persist(person2);

        transaction.commit();
        manager.close();

    }

    public static void main(String[] args) {
        save2();
    }
}
