package Amoozesh;

import java.util.Scanner;

public class Entekhab {
	public Erae[] e;
	public String NameUniEntkh;
	public int CodeUniEntkh;
	public int CodeGpEntkh;
	public int NumberYearEntkh;
	public String NameTchEntkh;


	public void setE(Erae[] e) {
		this.e = e;
	}

	public String getNameUniEntkh() {
		return NameUniEntkh;
	}

	public void setNameUniEntkh(String nameUniEntkh) {
		NameUniEntkh = nameUniEntkh;
	}

	public int getCodeUniEntkh() {
		return CodeUniEntkh;
	}

	public void setCodeUniEntkh(int codeUniEntkh) {
		CodeUniEntkh = codeUniEntkh;
	}

	public int getCodeGpEntkh() {
		return CodeGpEntkh;
	}

	public void setCodeGpEntkh(int codeGpEntkh) {
		CodeGpEntkh = codeGpEntkh;
	}

	public int getNumberYearEntkh() {
		return NumberYearEntkh;
	}

	public void setNumberYearEntkh(int numberYearEntkh) {
		NumberYearEntkh = numberYearEntkh;
	}

	public String getNameTchEntkh() {
		return NameTchEntkh;
	}

	public void setNameTchEntkh(String nameTchEntkh) {
		NameTchEntkh = nameTchEntkh;
	}

	public void Entekhabdars() {
		Scanner input = new Scanner(System.in);
		for (int l = 0; l < e.length; l++) {
			System.out.println("\n" + "NUNBER UNIT : " + l + "\n\t[" + e[l].getNameUniEra() + "] \n---------------");
		}
		System.out.println("Plz Enter the NUNBER UNIT that you want to choose from up : ");
		int NUNBER_UNIT = input.nextInt();
		NameUniEntkh = e[NUNBER_UNIT].getNameUniEra();
		CodeUniEntkh = e[NUNBER_UNIT].getCodeUniEra();
		CodeGpEntkh = e[NUNBER_UNIT].getCodeGp();
		System.out.println("\nnimsal ra vared kon  99982 : ");
		NumberYearEntkh = input.nextInt();
		NameTchEntkh = e[NUNBER_UNIT].getNameTchEra();
		
		setNameTchEntkh(NameUniEntkh);
		setCodeUniEntkh(CodeUniEntkh);
		setCodeGpEntkh(CodeGpEntkh);
		setNameTchEntkh(e[NUNBER_UNIT].getNameTchEra());
		

	}

	public void MoshahedeEntkh() {
		System.out.println("Name of unit : " + getNameUniEntkh() + "\n" + "code of unit: " + getCodeUniEntkh() + "\n"
				+ "code Group :" + getCodeGpEntkh() + "\n" + "name of Professor : " + getNameTchEntkh() + "\n----------------\n");
	}
}
