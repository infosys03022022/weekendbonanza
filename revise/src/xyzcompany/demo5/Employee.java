 package xyzcompany.demo5;
    public class Employee {
     static String empId;
     static String empName;
     static String designation;
     static int basic;

      public static void setData() {
           empId="E0001";
           empName="Jammy";
           designation="Manager";
           basic=30000;
           displayData();        
      }
     
      public static void displayData(){
           System.out.println("The details are");
           System.out.println("Employee Id:"+empId);
           System.out.println("Employee Name: "+empName);
           System.out.println("Employee's designation: "+designation);
           System.out.println("Employee's basic: "+basic);
     }
       
      public static void main (String args[]) {
           setData();
           displayData();
        }
    }

