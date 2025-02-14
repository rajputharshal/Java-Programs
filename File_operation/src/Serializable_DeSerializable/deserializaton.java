package Serializable_DeSerializable;
import java.io.*;

public class deserializaton {
    public static void main(String[] args) throws Exception {
      
            FileInputStream stm = new FileInputStream("D:\\mydrive.txt");
            ObjectInputStream out = new ObjectInputStream(stm);
            Object ob=out.readObject();
//            employee  e=(employee)out.readObject();
//        
//            System.out.println(e.getId()+" "+e.getName()+" "+e.getSal());

            if (ob != null ) {
                employee emp = (employee) ob;
                System.out.println("ID: " + emp.getId());
                System.out.println("Name: " + emp.getName());
                System.out.println("Salary: " + emp.getSal());
            } else {
                System.out.println("Object not found or not of the expected type.");
            }
            out.close(); // Close the ObjectInputStream.
       
    }
}
