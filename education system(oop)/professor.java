package Amoozesh;

import java.util.Scanner;

public class Ostad {
	public String name ; 
	public int  id ; 
	public String name_college ;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName_college() {
		return name_college;
	}
	public void setName_college(String name_college) {
		this.name_college = name_college;
	}
	
	public void TarifOstad() {
		Scanner input = new Scanner(System.in);
			System.out.println("ENTER THE NAME OF Professor \n ");
			String NameTch = input.next();
			System.out.println("ENTER THE CODE OF Professor \n ");
			int IdTch = input.nextInt();
			System.out.println("ENTER THE NAME OF COLLEGE Professor \n ");
			String CollegeTch = input.next();
		
			setName(NameTch);
			setId(IdTch);
			setName_college( CollegeTch);
	}

}
