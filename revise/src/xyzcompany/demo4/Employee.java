package xyzcompany.demo4;
    public class Employee {

      public static void employeeDetails() {
           String empId="E0001";
           String empName="Jammy";
           String designation="Manager";
           int basic=30000;
           displayData(empId,empName,designation,basic);        
      }
     
      public static void displayData(String empId, String empName, String designation , int basic){
           System.out.println("The details are");
           System.out.println("Employee Id:"+empId);
           System.out.println("Employee Name: "+empName);
           System.out.println("Employee's designation: "+designation);
           System.out.println("Employee's basic: "+basic);
     }
       
      public static void main (String args[]) {
           employeeDetails();
        }
    }
