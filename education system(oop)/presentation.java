package Amoozesh;

import java.util.*;

public class Erae {
	public Dars []d;
	public Ostad []o;
	private String CollegeUniEra;
	private String NameUniEra;
	private int CodeUniEra;
	private int CodeGp;
	private int NumberYearEra;
	private String NameTchEra;

	public void setD(Dars[] d) {
		this.d = d;
	}

	public void setO(Ostad[] o) {
		this.o = o;
	}
	
	
	public String getCollegeUniEra() {
		return CollegeUniEra;
	}


	public void setCollegeUniEra(String collegeUniEra) {
		CollegeUniEra = collegeUniEra;
	}

	public String getNameUniEra() {
		return NameUniEra;
	}

	public void setNameUniEra(String nameUniEra) {
		NameUniEra = nameUniEra;
	}

	public int getCodeUniEra() {
		return CodeUniEra;
	}

	public void setCodeUniEra(int codeUniEra) {
		CodeUniEra = codeUniEra;
	}

	public int getCodeGp() {
		return CodeGp;
	}

	public void setCodeGp(int codeGp) {
		CodeGp = codeGp;
	}

	public int getNumberYearEra() {
		return NumberYearEra;
	}

	public void setNumberYearEra(int numberYearEra) {
		NumberYearEra = numberYearEra;
	}

	public String getNameTchEra() {
		return NameTchEra;
	}

	public void setNameTchEra(String nameTchEra) {
		NameTchEra = nameTchEra;
	}

	
	public void Eraedars() {
		Scanner input = new Scanner(System.in);
		for (int l = 0; l < d.length; l++) {
			System.out.println("\n" + "NUMBER UNIT : " + l + "\n\t[" + d[l].getName() + "] \n---------------");
		}
		System.out.println("Plz Enter the NUMBER UNIT that you want to choose from up : ");
		int NUNBER_UNIT = input.nextInt();

		String NameUniEra = d[NUNBER_UNIT].getName();
		String CollegeUniEra = d[NUNBER_UNIT].getName_college();
		int CodeUniEra = d[NUNBER_UNIT].getUni_code();
		System.out.println("\ncode gp ro vared kon : ");
		int CodeGp = input.nextInt();
		System.out.println("\nnimsal ra vared kon  99982 : ");

		int NumberYearEra = input.nextInt();
		for (int k = 0; k < o.length; k++) {
			System.out.println("\n" + "NUMBER Professor : " + k + "\n\t[" + o[k].getName() + "] \n---------------");
		}
		System.out.println("Plz Enter the NUNBER Professor that you want to choose from up : ");
		int NUNBER_OSTAD = input.nextInt();
		String nameTchEra = o[NUNBER_OSTAD].getName();
		
		
		setCollegeUniEra(CollegeUniEra);
		setNameUniEra(NameUniEra);
		setCodeUniEra(CodeUniEra);
		setCodeGp(CodeGp);
		setNumberYearEra(NumberYearEra);
		setNameTchEra(nameTchEra);
		
	//	System.out.println("okkkkkkkkk" + nameTchEra );
	}
	
	
	public void MoshahedeUniEra() {

		System.out.println("name of unit : " + getNameUniEra() + " \n" + "code of unit : " + getCodeUniEra() + " \n"
				+ "code of Group : " + getCodeGp() + " \n" + "nimsal voroudi : "
				+ getNumberYearEra() + "\n----------------\n");
	}
}
