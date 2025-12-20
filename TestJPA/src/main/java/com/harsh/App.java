package com.harsh;

import com.harsh.entity.User;
import com.harsh.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        try{
            while(true) {
                System.out.println("Press 1 for save");
                System.out.println("Press 2 for fetch by id");
                System.out.println("Press 0 for exit");
                System.out.println("Enter your choice");
                int choice = sc.nextInt();
                switch(choice) {
                    case 1: insert();break;
                    case 2: fetchById();break;
                    case 0: System.exit(0);
                }
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static void insert(){
        EntityManagerFactory factory = JPAUtil.getFactory();
        try(EntityManager entity = factory.createEntityManager();){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter name");
            String name = sc.next();
            System.out.println("Enter password");
            String password = sc.next();
            System.out.println("Enter email id");
            String emailid = sc.next();
            System.out.println("Enter age");
            int age = sc.nextInt();
            User user = new User();
            user.setAge(age);
            user.setEmail(emailid);
            user.setName(name);
            user.setPassword(password);
            EntityTransaction transaction = entity.getTransaction();
            transaction.begin();
            entity.persist(user);
            transaction.commit();
            System.out.println("Record saved...");

        }
        catch (Exception e){
            e.printStackTrace();

        }
    }
    public static void fetchById(){
        EntityManagerFactory managerFactory = JPAUtil.getFactory();
        try(EntityManager entity = managerFactory.createEntityManager();){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the id: ");
            int id = sc.nextInt();
            User user = entity.find(User.class, id);
            if(user != null){
                System.out.println(user.getName()+"  "+user.getAge());
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
