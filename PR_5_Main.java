// this program is prepared by 21ce013 Abhi Bhimani
//Develop a Program that illustrate method overloading concept.
// GITHUB LINK : https://github.com/abhii14758/-JAVA-PRACTICAL-FILE-2

import java.util.Scanner;

public class PR_5_Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //declare variable as required
        String name_std,roll_no_std,branch_std,faculty_of_pro,name_pro,degree_pro;
        int experience;
        long salary;

        //input fr student 
        System.out.println("Taking information of student  :");
        System.out.print("Name of student  :");
        name_std = s.next();
        System.out.print("Roll no of student  :");
        roll_no_std = s.next();
        System.out.print("Branch student studies in  :");
        branch_std = s.next();
        System.out.println("------------------------------------------------------------------");
        
        //input for faculty
        System.out.println("Taking information for faculty  :");
        System.out.print("Name of professor  :");
        name_pro = s.next();
        System.out.print("Degree of professor  :");
        degree_pro = s.next();
        System.out.print("Experience of teaching  :");
        experience = s.nextInt();
        System.out.print("Teaches in  :");
        faculty_of_pro = s.next();
        System.out.print("His/her salary  :");
        salary = s.nextLong();
        System.out.println("------------------------------------------------------------------");
        
        //method information call for show data of student 
        System.out.println("The given information of student is  :");
        PR_5_Sub.information(roll_no_std, name_std, branch_std);
        System.out.println("------------------------------------------------------------------");
        
        //method information call for show data of faculty member
        System.out.println("The given information of professor is  :");
        PR_5_Sub.information(name_pro, degree_pro, faculty_of_pro, experience, salary);
    }
}