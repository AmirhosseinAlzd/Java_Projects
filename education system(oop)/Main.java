package Amoozesh;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		////////////////
		System.out.println("enter the number of stu : ");
		int NumberStd = input.nextInt();
		Daneshjoo[] d = new Daneshjoo[NumberStd];
		for (int i = 0; i < d.length; i++) {
			d[i] = new Daneshjoo();
		}
		//////////////
		System.out.println("enter the number of unit : ");
		int NumberUni = input.nextInt();
		Dars[] u = new Dars[NumberUni];
		for (int i = 0; i < u.length; i++) {
			u[i] = new Dars();
		}
		//////////////////////
		System.out.println("enter the number of Teacher : ");
		int NumberTch = input.nextInt();
		Ostad[] o = new Ostad[NumberTch];
		for (int i = 0; i < o.length; i++) {
			o[i] = new Ostad();
		}
		///////////////////////////
		System.out.println(" chand dars ra Erae mikonand ?  :  ");
		int NumberErae = input.nextInt();
		Erae[] Er = new Erae[NumberErae];
		for (int i = 0; i < Er.length; i++) {
			Er[i] = new Erae();
		}

///////////////////////////////////////////////////////////////////////////////////////////////////////////
		int CASE = 0;

		while (CASE != 9) {

			System.out.println("Please choose one of this cases :\n\n" + "1- Tarif daneshjo\n" + "2- Tarif darss\n"
					+ "3- Tarif ostad\n" + "4- Erae dars\n" + "5- Enthekhab dars\n" + "6- moshahede ba esme daneshgah\n"
					+ "7- moshahede doros ba name daneshgah\n" + "8- moshahede ba id code\n" + "9- Exit\n");

			CASE = input.nextInt();
			switch (CASE) {
			case 1:
				for (int i = 0; i < d.length; i++) {
					System.out.format("[Student (%d)] \n", i + 1);
					d[i].TarifDaneshjo();
					System.out.format(" *******Thank for your information of studen [%d]********\n ", i + 1);
				}
				break;
			case 2:
				for (int i = 0; i < u.length; i++) {
					System.out.format("[Unit (%d)] \n", i + 1);
					u[i].TarifDars();
					System.out.format(" *******Thank for your information of Unit [%d]********\n ", i + 1);
				}
				break;
			case 3:
				for (int i = 0; i < o.length; i++) {
					System.out.format("[Professor (%d)] \n", i + 1);
					o[i].TarifOstad();
					System.out.format(" *******Thank for your information of Professor [%d]********\n ", i + 1);
				}
				break;
			case 4:
				for (int i = 0; i < Er.length; i++) {
					Er[i].setD(u);
					Er[i].setO(o);
				}
				for(int j= 0 ; j<Er.length ; j++) {
					Er[j].Eraedars();
				}
				break;
			case 5:
				for (int j = 0; j < d.length; j++) {

					for (int i = 0; i < d.length; i++) {
						System.out.println(
								"\n" + "NUMBER DANESHJOO : " + i + "\n\t[" + d[i].getname() + "] \n---------------");
					}
					System.out.println("Plz Enter the NUMBER DANESHJOO of Student that you want to choose from up : ");
					int NUNBER_DANESHJOO = input.nextInt();
					d[NUNBER_DANESHJOO].setEr(Er);
					d[NUNBER_DANESHJOO].Entekhab();
				}

				break;
			case 6:
				System.out.println("Enter the Name of college : ");
				String collegeName = input.next();
				int c = 0;
				for (int i = 0; i < d.length; i++) {
					if (d[i].getname_college().equals(collegeName)) {
						System.out.format("\t Student [ %d ]: \n", i + 1);
						d[i].MoshahedeStd();
					} else {
						c++;
					}
				}
				if (c >= d.length) {
					System.out.println(" college not found !");
				}
				break;
			case 7:
				System.out.println("Enter the Name of college : ");
				String collegeNameera = input.next();
				int b = 0;
				for (int i = 0; i < Er.length; i++) {
					if (Er[i].getCollegeUniEra().equals(collegeNameera)) {
						System.out.format("\ndars erae shode [%d]: \n" , i+1);
						Er[i].MoshahedeUniEra();
					} else {
						b++;
					}
				}
				if (b >= Er.length) {
					System.out.println(" college not found !");
				}
				break;
			case 8:
				System.out.println("Enter the code id of student : ");
				int Id_Daneshjoo = input.nextInt();
				int v = 0;
				for (int i = 0; i < d.length; i++) {
					if (d[i].getid() == Id_Daneshjoo) {
						System.out.format("\ndars Entekhab shode  [%d] : \n" , i+1);
						d[i].MoshahedeEntekhab();
					} else {
						v++;
					}
				}
				if (v >= Er.length) {
					System.out.println(" college not found !");
				}
				break;
			}
		}
	}
}
