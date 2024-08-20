import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        String Name;
        String dept;
        int java;
        int py;
        int dbms;
        int Total;
        Scanner r=new Scanner(System.in);
        Name=r.next();
        dept=r.next();
        java=r.nextInt();
        py=r.nextInt();
        dbms=r.nextInt();
        System.out.println("Name:"+Name);
        System.out.println("Dept:"+dept);
        System.out.println("Java:"+java);
        System.out.println("python:"+py);
        System.out.println("DBMS:"+dbms);
        System.out.println("TotalMark:"+(java+py+dbms));
        
        
    }
}