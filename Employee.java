package employee;

import java.lang.Math;
class Employee {

	public static void main(String[] args) {
		int present=1;
		double empCheck=Math.floor(Math.random()*10)%2;
		if(empCheck == present)
		{
			System.out.println("employe is present");
		}
		
		 else
		{
			System.out.println("employe is absent");

		}
	}

}
