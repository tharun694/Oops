package org.practice.employee;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Employee {
    int id;
    String name;
    int birth_year;
    int age;
    String loation;

    public Employee(int id, String name, int birth_year, int age, String loation) {
        this.id = id;
        this.name = name;
        this.birth_year = birth_year;
        this.age = age;
        this.loation = loation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(int birth_year) {
        this.birth_year = birth_year;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLoation() {
        return loation;
    }

    public void setLoation(String loation) {
        this.loation = loation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birth_year=" + birth_year +
                ", age=" + age +
                ", loation='" + loation + '\'' +
                '}';
    }



static List<Employee>list=new ArrayList<>(Arrays.asList(
        new Employee(1,"tharun",2003,22,"chennai"),
                new Employee(2,"arun",2001,24,"banglore"),
        new Employee(3,"varun",2002,23,"mumbai")

));
    public static List<Employee> getEmployee() {

       return list;
    }

   static public List<Employee> addemployee() {
        Scanner scan=new Scanner(System.in);
int id=scan.nextInt();
String name=scan.next();
scan.nextLine();
int year=scan.nextInt();
int age=scan.nextInt();
String locate=scan.next();
scan.nextLine();
list.add(new Employee(id,name,year,age,locate));
return list;
    }

   static public List<Employee> updateEmployee(int detail) {
       Scanner scan=new Scanner(System.in);
       int id=detail;
       String name=scan.nextLine();
       int year=scan.nextInt();
       int age=scan.nextInt();
       scan.nextLine();
       String locate=scan.nextLine();

        Employee employee=new Employee(id,name,year,age,locate);
        int index=0;
        for(int i=0;i<list.size();i++){

            if(list.get(i).getId()==id){
                index=i;
            }
            list.set(index,employee);
        }

        return list;
    }


   static public List<Employee> deleteEmpoyee(int id) {
       for(int i=0;i<list.size();i++){

           if(list.get(i).getId()==id){
               list.remove(i);
           }
       }

        return list;
        }

    }



