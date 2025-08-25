package org.practice.encapsulation;

import org.practice.Manager;

import java.util.Scanner;

public class Encapsulation {
    static private Manager m;

    Encapsulation(Manager m) {
        this.m = m;
    }

    Encapsulation() {

    }

    private String name = "tharun";
    private String password = "1234";
    boolean isPassword;
    boolean isUserName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null & name.equals(this.name)) {
            this.name = name;
            isUserName = true;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        try {
            if (password.length() == 4&& password.equals(this.password)) {
                this.password = password;
                isPassword = true;
            }
        }
        catch (Exception e){
        System.out.println("login failed");
    }

    }


    public static void main(String[] args) {
//        Encapsulation e=new Encapsulation(Manager m);
        System.out.println("Enter userName and Password");
        Scanner scan = new Scanner(System.in);

        String password = scan.nextLine();
            String name = scan.nextLine();

        Encapsulation e = new Encapsulation();
        e.setName(name);
        e.setPassword(password);
//        System.out.println(e.getName());
//        System.out.println(e.getPassword());
        if (e.isUserName && e.isPassword) {
            System.out.println("login sucessfully completed");
            System.out.println("What do want to do?:");
            Scanner scanner = new Scanner(System.in);
            String perform = scanner.next();

            if (perform.equals("add")) {
                System.out.println("please enter employee details");
                System.out.println(m.addEmployee());
            } else if (perform.equals("get")) {
                System.out.println(m.getEmployee());
            } else if (perform.equals("update")) {
                System.out.println("Enter Employee id");
                System.out.println(m.updateEmployee(scanner.nextInt()));
            } else if (perform.equals("delete")) {
                System.out.println("Enter the id");
                int id = scanner.nextInt();
                System.out.println(m.deleteEmployee(id));
            }
        }
    }
}