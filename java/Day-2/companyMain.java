import java.util.*;
public class companyMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter company name");
        String name = s.nextLine();
        System.out.println("Enter name of employees separated by commas");
        String employees = s.nextLine();
        
        String arr_emp[] = employees.split(",");
        System.out.println("Enter Team lead name");
        String team_lead = s.nextLine();
        company c = new company();
        c.setName(name);
        c.setEmployees(employees);
        c.setTeamLead(team_lead);
        boolean result = new companyMain().check(arr_emp,c.getTeamLead());
        if(!(result)){
            System.out.println("Invalid");
        }
        else{
            System.out.println("Company : "+ c.getName());
            System.out.println("Employees : "+c.getEmployees());
            System.out.println("Team Lead : "+ c.getTeamLead());
        }
        s.close();
    }
    public  boolean check (String arr[], String name){
        for(int i=0;i<arr.length;i++){
            if(arr[i].equalsIgnoreCase(name)){
                return true;       
            }
        }
        return false;
    }
}