package com.harsh;

import com.harsh.dao.DaoImpl;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        try{
            Scanner sc = new Scanner(System.in);
            DaoImpl dao = new DaoImpl();
            while (true){
                System.out.println("Press 1 for registration of user: ");
                System.out.println("Press 2 for deletion of user: ");
                System.out.println("Press 3 for updation of user: ");
                System.out.println("Press 4 for show users using HQL: ");
                System.out.println("Press 5 for get user by id using HQL");
                System.out.println("Press 0 for exit.");
                int choice = sc.nextInt();
                switch (choice){
                    case 0: System.exit(0);
                    case 1: dao.registerUser(); break;
                    case 2: dao.deleteUser(); break;
                    case 3: dao.updateUser(); break;
                    case 4: dao.showUsers(); break;
                    case 5: dao.getUserHql(); break;
                    default: System.out.println("Invalid input");
                        break;
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
