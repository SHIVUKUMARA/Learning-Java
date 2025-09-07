package com.statements;

public class Elseif {
    public static String grade(int num) {
    	if(num >=80) {
    		return "Marks obtained: "+num+" and Your grade is : Distinction";
    	}else if(num>= 60 && num<=80) {
    		return "Marks obtained: "+num+" and Your grade is : 1st class";
    	}else if(num>=40 && num <=60) {
    		return "Marks obtained: "+num+" and Your grade is : 2nd class";
    	}else if(num >=35 && num<=40) {
    		return "Marks obtained: "+num+" and Your grade is : 3rd class";
    	}else {
    		return "Marks obtained: "+num+" Try Again...";
    	}
    }
	public static void main(String[] args) {
       System.out.println(grade(73));
       System.out.println(grade(91));
       System.out.println(grade(31));
	}

}
