package xyzcompany.demo3;
    public class Employee {

      public static void employeeDetails() {
           String empId="E0001";
           String empName="Jammy";
           String designation="Manager";
           int basic=30000;
           displayData(empId,empName,designation,basic);        
      }
     
      public static void displayData(String id, String name, String desig , int bsc){
           System.out.println("The details are");
           System.out.println("Employee Id:"+id);
           System.out.println("Employee Name: "+name);
           System.out.println("Employee's designation: "+desig);
           System.out.println("Employee's basic: "+bsc);
     }
       
      public static void main (String args[]) {
           employeeDetails();
        }
    }