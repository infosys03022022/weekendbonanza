package xyzcompany.demo6;
     public class Employee {
     public String empId;
     public String empName;
     public String designation;
     public int basic;

      public void setData() {
           empId="E0001";
           empName="Jammy";
           designation="Manager";
           basic=30000;
           displayData();        
      }
     
      public void displayData(){
           System.out.println("The details are");
           System.out.println("Employee Id:"+empId);
           System.out.println("Employee Name: "+empName);
           System.out.println("Employee's designation: "+designation);
           System.out.println("Employee's basic: "+basic);
     }
       
      public static void main (String args[]) {
           Employee employee=new Employee();           
           employee.setData();
           employee.displayData();
        }
    }
