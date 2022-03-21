package Amoozesh;
import java.util.*;

public class Dars {
	public String name ; 
	public int  uni_code ;
	public int UnitUni;
	public char uni_type;
	public String pre_unit;
	public String name_college ;
	
	
	public int getUnitUni() {
		return UnitUni;
	}

	public void setUnitUni(int UnitUni) {
		this.UnitUni = UnitUni;
	}

	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}

	public int getUni_code() {
		return uni_code;
	}
	public void setUni_code(int uni_code) {
		this.uni_code = uni_code;
	}
	public char getUni_type() {
		return uni_type;
	}
	public void setUni_type(char uni_type) {
		this.uni_type = uni_type;
	}
	public String getPre_unit() {
		return pre_unit;
	}
	public void setPre_unit(String pre_unit) {
		this.pre_unit = pre_unit;
	}
	public String getName_college() {
		return name_college;
	}
	public void setName_college(String name_college) {
		this.name_college = name_college;
	}
	public void TarifDars() {
			Scanner input = new Scanner(System.in);
			System.out.println("ENTER THE NAME OF UNIT \n ");
			String NameUni = input.next();
			System.out.println("ENTER THE code OF UNIT \n ");
			int CodeUni = input.nextInt();
			System.out.println("ENTER THE numberunit OF UNIT \n ");
			int UnitUni = input.nextInt();
			System.out.println("ENTER THE Type OF UNIT \n (EKHTESASI/OMOOMI , ENTER E/O) ");
			char TypeUni = input.next().charAt(0);
			System.out.println("ENTER THE NAME OF PREUNIT \n ");
			String PreUni = input.next();
			System.out.println("ENTER THE NAME OF COLLEGE UNIT \n ");
			String CollegeUni = input.next();
			
			setName(NameUni);
			setUni_code(CodeUni);
			setUnitUni(UnitUni);
			setUni_type(TypeUni);
			setPre_unit(PreUni);
			setName_college(CollegeUni); 
		}
	}

