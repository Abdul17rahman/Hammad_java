/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Myfiles;

/**
 *
 * @author user
 */
public class methods {
    
    //This method just adds the total marks for the whole term
    public int addmarks(int bot ,int mid, int end){
        int t = bot + mid + end;
        return t;
    }
    //This function checks the marks of a Student and gives out the appropriate aggreagates.
    public String aggreagates(int marks){
        
        String aggr = null;
        if(marks>=75){
            aggr = "D1";
        }
        if((marks >= 70) &&(marks <= 74)){
            aggr = "D2";
        }
        if((marks >= 65) &&(marks <= 69)){
            aggr = "C3";
        }
        if((marks >= 60) &&(marks <= 64)){
            aggr = "C4";
        }
        if((marks >= 55) &&(marks <= 59)){
            aggr = "C5";
        }
        if((marks >= 50) &&(marks <= 54)){
            aggr = "C6";
        }
        if((marks >= 40) &&(marks <= 49)){
            aggr = "P7";
        }
        if((marks >= 35) &&(marks <= 39)){
            aggr = "P8";
        }
        if((marks <= 34)){
            aggr = "F9";
        }
  
        return aggr;
    }
    //Method gets the aggreagate digit
    public int getAggr(String aggr){
        String agg = aggr.substring(1);
        int value = Integer.parseInt(agg);
        return value;
    }
    //Calculates the Total Aggreagates
    public int CalAggr(int m, int e, int s, int sst){
        int total = m + e + s + sst;
        return total;
    }
    //Gives the Comments 
    public String Comments(String Aggr){
        String Comm = null;
        switch(Aggr){
            case "D1":
                 Comm = "Excellent";
                 break;
            case "D2":
                Comm = "Very Good";
                break;
            case "C3":
                Comm = "Fairly Good";
                break;
            case "C4":
                Comm = "Good";
                break;
            case "C5":
                Comm = "Good";
                break;
            case "C6":
                Comm = "Good";
                break;
            case "P7":
                Comm = "Fair";
                break;
            case "P8":
                Comm = "Trying";
                break;
            case "F9":
                Comm = "Failed";
                break;
            default:
                Comm = "Invalid";
                break;
        }
        return Comm;
    }
    //Awards a Division 
    public String Div(int totalMarks){
        String Division = null;
        if((totalMarks >= 4) && (totalMarks <= 12)){
            Division = "I";
        }
        if((totalMarks >= 13) && (totalMarks <= 24)){
            Division = "II";
        }
        if((totalMarks >= 23) && (totalMarks <= 36)){
            Division = "III";
        }
        if((totalMarks >= 37)){
            Division = "Ungraded";
        }
        return Division;
    }
    
}
