package Amoozesh;

import java.util.*;

public class Daneshjoo {
	public Entekhab [] E ;
	public int a;
	private String name ;
	private int id ;
	private String name_college ;
	private String name_stu_uni ;
	private int year ;
	public Entekhab[] En;
	public Erae[] Er ;
	// SETTER

	public void setENTEKHAB(Entekhab [] E) {
		this.E=E;
	}
	
	
	public void setEr(Erae[] er) {
		Er = er;
	}
	
	
	public void setname(String a) {
		name = a;
	}
	public void setid(int a) {
		id = a;
	}

	public void setname_college(String a) {
		name_college = a;
	}

	public void setname_stu_uni(String a) {
		name_stu_uni = a;
	}

	public void setyear(int a) {
		year = a;
	}

	// GETTER

	public String getname() {
		return name;
	}

	public int getid() {
		return id;
	}

	public String getname_college() {
		return name_college;
	}

	public String getname_stu_uni() {
		return name_stu_uni;
	}

	public int getyear() {
		return year;
	}

	public void TarifDaneshjo() {
		Scanner input = new Scanner(System.in);
		System.out.println("ENTER THE NAME OF STUDENT PLZ : ");
		String NameStd = input.next();
		System.out.println("ENTER THE Id OF STUDENT PLZ : ");
		int IdStd = input.nextInt();
		System.out.println("ENTER THE college OF STUDENT PLZ : ");
		String CollegeStd = input.next();
		System.out.println("ENTER THE study OF STUDENT PLZ : ");
		String StudyStd = input.next();
		System.out.println("ENTER THE  Year OF STUDENT PLZ : ");
		int YearStd = input.nextInt();
	

		setname(NameStd);
		setid(IdStd);
		setname_college(CollegeStd);
		setname_stu_uni(StudyStd);
		setyear(YearStd);
	}

	public void MoshahedeStd() {
		System.out.println(getname() + "\n" + getid() + "\n" + getname_college() + "\n"
				+ getname_stu_uni() + "\n" + getyear() + "\n");

	}

	public void Entekhab() {
		Scanner input = new Scanner(System.in);
		System.out.println("daneshjoo chand dars ra mikhahad bardarad ?? \n");
		int Number_Entkh = input.nextInt();
		Entekhab[] En = new Entekhab[Number_Entkh];
		
		for(int i=0 ; i<Number_Entkh ; i++) {
			En[i]= new Entekhab();
			En[i].setE(Er);
			
		}
		for(int j=0 ; j<Number_Entkh ; j++) {
			En[j].Entekhabdars();
		}
		//System.out.println("erae : "+ Er[0].getNameTchEra());
		//System.out.println("entekhab : "+ En[0].getNameTchEntkh());
		setENTEKHAB(En);
	}
	public void MoshahedeEntekhab() {
		for(int i = 0  ; i<E.length ; i++) {
			E[i].MoshahedeEntkh();
		}
	}
	

}
