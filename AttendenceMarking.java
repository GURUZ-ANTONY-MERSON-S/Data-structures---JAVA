

/*Question 3 – Employee Attendance
Problem Statement

A company records whether each employee reported to work on a particular day. Every employee's attendance is represented using a single character:

P for Present
A for Absent

The HR department wants to know how many employees were present and how many were absent so that they can prepare the daily attendance report.

Write a program to count and print the total number of present and absent employees.*/import java.util.Scanner;
import java.util.Arrays;

class AttendenceMarking{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int N=sc.nextInt();
        char attendence[]=new char[N];
        
        for(int i=0;i<attendence.length;i++){
            attendence[i]=sc.next().charAt(0);
        }
        
        int present=0;
        int absent=0;
        
        for(int i=0;i<N;i++){
            if(attendence[i]=='P' || attendence[i]=='p'){
                present++;
            }
            else{
                absent++;
            }
        }
        System.out.println("Total present: "+present);
        System.out.println("Total absent: "+absent);
        
        sc.close();
    }
}