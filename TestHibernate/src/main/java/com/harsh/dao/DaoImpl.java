package com.harsh.dao;

import com.harsh.model.User;
import com.harsh.util.HibernateUtil;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;
import java.util.Scanner;

public class DaoImpl {
    private static SessionFactory sessionFactory = HibernateUtil.getFactory();
    Scanner sc = new Scanner(System.in);
    public  void registerUser(){
        try(Session session = sessionFactory.openSession();){
            Transaction ts = session.beginTransaction();
            System.out.println("Enter user name: ");
            String name = sc.next();
            System.out.println("Enter your email: ");
            String email = sc.next();
            System.out.println("Enter the password: ");
            String password = sc.next();
            User user = new User();
            user.setName(name);
            user.setEmail(email);
            user.setPassword(password);
            session.persist(user);
            ts.commit();
            System.out.println("User registered successfully");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    public  String deleteUser(){
        try(Session session = sessionFactory.openSession();){
            Transaction ts = session.beginTransaction();
            System.out.println("Enter the id you want to delete: ");
            int id = sc.nextInt();
            User user = session.get(User.class, id);
            if(user == null){
                return "User not found";
            }
            session.remove(user);
            ts.commit();
            return "User deleted successfully";
        }
    }
    public  String updateUser(){
        try(Session session = sessionFactory.openSession();){
            Transaction ts = session.beginTransaction();
            System.out.println("Enter the id you want to update: ");
            int id = sc.nextInt();
            User user = session.get(User.class, id);
            if(user == null){
                return "User not found";
            }
            System.out.println(user.getName() + " Enter user updated name: ");
            String name = sc.next();
            user.setName(name);
            session.persist(user);
            ts.commit();
            return "User updated successfully";
        }
    }
    public  void showUsers(){
        try(Session session = sessionFactory.openSession();){

            Query query = session.createQuery("from User", User.class);
            List<User> result = query.getResultList();
            for(User user: result){
                System.out.println(user.getName() + " " + user.getId());
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void getUserHql(){
        try(Session session = sessionFactory.openSession();){
            System.out.println("Enter the user id: ");
            int id = sc.nextInt();
            TypedQuery<User> query = session.createQuery("from User where id=:id", User.class);
            query.setParameter("id", id);
            User user = query.getSingleResult();
            if(user != null){
                System.out.println(user.getName() + " " + user.getId() + " " + user.getEmail() );
            }
            else{
                System.out.println("User not found");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
