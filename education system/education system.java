package amozesh;
import java.util.*;
public class amozesh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of stu : ");
        int NumberStd = input.nextInt();
        String[] NameStd = new String[NumberStd];
        int[] IdStd = new int[NumberStd];
        String[] CollegeStd =new String[NumberStd];
        String[] StudyStd = new String[NumberStd];
        int[] YearStd = new int[NumberStd];
        
        
         System.out.println("enter the number of unit : ");
        int NumberUni = input.nextInt();
        String[] NameUni = new String[NumberUni];
        int[] CodeUni = new int[NumberUni];
        int[] UnitUni = new int[NumberUni];
        char[] TypeUni = new char[NumberUni];
        String[] PreUni = new String[NumberUni];
        String[] CollegeUni =new String[NumberUni];
        
        
        System.out.println(" chand dars ra Erae mikonand ?  :  ");
        int NumberErae = input.nextInt();
        String[] CollegeUniEra = new String[NumberErae];
        String[] NameUniEra = new String[NumberErae];
        int[] CodeUniEra = new int[NumberErae];       
        int[] CodeGp = new int [NumberErae];        
        int[] NumberYearEra = new int [NumberErae];
        int[] IdTchEra = new int[NumberErae];
        String[] NameTchEra = new String[NumberErae];
        
        int[] IdStdEntkh = new int[NumberStd];
        int[][] CodeEntkhStd = new int[NumberStd][NumberErae];
        String[][] NameUniEntkh = new String[NumberStd][NumberErae];
        int[][] CodeUniEntkh = new int[NumberStd][NumberErae];
        int[][] CodeGpEntkh = new int [NumberStd][NumberErae];
        int[][] NumberYearEntkh = new int [NumberStd][NumberErae];
        String[][] NameTchEntkh = new String[NumberStd][NumberErae];
        int[] numEntkh = new int[NumberStd];
        
        System.out.println("enter the number of Teacher : ");
        int NumberTch = input.nextInt();
        String[] NameTch = new String[NumberTch];
        int[] IdTch = new int[NumberTch];
        String[] CollegeTch = new String[NumberTch];
        
        int CASE = 0;
        
        while(CASE!=9){
            
            System.out.println( "Please choose one of this cases :\n\n"
                + "1- Tarif daneshjo\n"
                + "2- Tarif darss\n"
                + "3- Tarif ostad\n"
                + "4- Erae dars\n"
                + "5- Enthekhab dars\n"
                + "6- moshahede ba esme daneshgah\n"
                + "7- moshahede ba id cod\n"
                + "8- moshahede doros ba name daneshgah\n"
                + "9- Exit\n");
        
        CASE = input.nextInt();
        switch(CASE){
            case 1 :
                TarifDaneshjo(NameStd , IdStd ,CollegeStd ,StudyStd,YearStd , input);
                break;
            case 2 :
                TarifDars(NameUni ,CodeUni , UnitUni ,TypeUni,PreUni , CollegeUni , input );
                break;
            case 3 :
                TarifOstad(NameTch ,IdTch , CollegeTch , input );
                break;
            case 4 :
                EraeUni(CollegeUni , CollegeUniEra ,NameUni , NameUniEra ,CodeUni , CodeUniEra ,CodeGp ,IdTch ,IdTchEra ,  NumberYearEra , NameTch , NameTchEra , input);
                break;
            case 5 :
                EntekhabUni(numEntkh ,IdStd ,IdStdEntkh ,NameUniEra , NameUniEntkh,  CodeUni , CodeUniEntkh ,CodeGp , CodeGpEntkh , CodeEntkhStd ,NameTchEra , NameTchEntkh ,  NumberYearEntkh ,  input );
                break;
            case 6 :
                MoshahedeStd(NameStd , IdStd ,CollegeStd,StudyStd,YearStd , input);
                break;
            case 7 :
                MoshahedUniEntkh( numEntkh , IdStdEntkh ,   NameUniEntkh ,  CodeUniEntkh , CodeGpEntkh  , NameTchEntkh ,  input );
                break;
            case 8 :
                MoshahedeUniEra( CollegeUniEra, NameUniEra , CodeUniEra ,CodeGp  ,IdTchEra ,  NumberYearEra , NumberErae , input);
                
                break;
            
        }
        }
        
        
        
    }
    
        public static void TarifDaneshjo(String[]NameStd ,int[] IdStd , String[] CollegeStd, String [] StudyStd,int[] YearStd , Scanner input){
          
            for(int i = 0 ; i<NameStd.length ; i++){
                System.out.format("ENTER THE NAME OF STUDENT %d PLZ : " , i+1 );
                NameStd[i]=     input.next();
                System.out.format("ENTER THE Id OF STUDENT %d PLZ : " , i+1 );
                IdStd[i] =      input.nextInt();
                System.out.format("ENTER THE college OF STUDENT %d PLZ : " , i+1 );
                CollegeStd[i] = input.next();   
                System.out.format("ENTER THE study OF STUDENT %d PLZ : " , i+1 );
                StudyStd[i] =   input.next(); 
                System.out.format("ENTER THE  Year OF STUDENT %d PLZ : " , i+1 );
                YearStd[i]  =   input.nextInt();   
                System.out.println(" \nThank for your information\n ");
            }
            
        }
        public static void TarifDars(String[] NameUni ,int[] CodeUni , int[] UnitUni ,char[] TypeUni,String[] PreUni , String[] CollegeUni , Scanner input ){
           for(int i = 0 ; i<NameUni.length ; i++){
               System.out.format("ENTER THE NAME OF UNIT %d \n " , i+1);
                NameUni[i]=       input.next();
                System.out.format("ENTER THE code OF UNIT %d \n " , i+1);
                CodeUni[i] =      input.nextInt();
                System.out.format("ENTER THE numberunit OF UNIT %d \n " , i+1);
                UnitUni[i] =      input.nextInt();
                System.out.format("ENTER THE Type OF UNIT %d \n (EKHTESASI/OMOOMI , ENTER E/O) " , i+1);
                TypeUni[i] =      input.next().charAt(0);
                System.out.format("ENTER THE NAME OF PREUNIT %d \n " , i+1);
                PreUni[i]  =      input.next();
                System.out.format("ENTER THE NAME OF COLLEGE UNIT %d \n " , i+1);
                CollegeUni[i]=    input.next();
                System.out.format("   THANKS FOR THE INFORMATION %d \n " , i+1);
            }
        }
        public static void TarifOstad(String[] NameTch ,int[] IdTch ,String[] CollegeTch , Scanner input ){
            for(int i = 0 ; i<NameTch.length ; i++){
                System.out.format("ENTER THE NAME OF OSTAD %d \n " , i+1);
                NameTch[i]=       input.next();
                System.out.format("ENTER THE CODE OF OSTAD %d \n " , i+1);
                IdTch[i] =        input.nextInt();
                System.out.format("ENTER THE NAME OF COLLEGE OSTAD %d \n " , i+1);
                CollegeTch[i] =   input.next();   
                System.out.format("   THANKS FOR THE INFORMATION %d \n " , i+1);
                
            }
        }
        public static void MoshahedeStd(String[]NameStd ,int[] IdStd , String[] CollegeStd, String [] StudyStd,int[] YearStd , Scanner input){
            System.out.println("Enter the Name of college : ");
            String collegeName = input.next();
            int c = 0 ;
            for(int i = 0 ; i<NameStd.length ; i++){
                if(CollegeStd[i].equals(collegeName)){
                    System.out.format("\t Student [ %d ] \n" , i+1 );
                    System.out.println(NameStd[i] + "\n" + IdStd[i] + "\n" + CollegeStd[i] + "\n" + StudyStd[i] + "\n" + YearStd[i] + "\n");
                }else{
                    c++;
                }
            }
            if(c>=NameStd.length){
                System.out.println(" college not found !");
            }            
        }
        public static void EraeUni(String[] CollegeUni ,String[] CollegeUniEra , String[] NameUni , String[] NameUniEra ,int[] CodeUni ,int [] CodeUniEra ,int [] CodeGp ,int [] IdTch ,int [] IdTchEra , int[] NumberYearEra ,String[] NameTch,String[] NameTchEra , Scanner input)
        {
            int c=0 ;
            for(int i= 0 ; i<CollegeUniEra.length ; i++)
            {
                for(int l=0 ; l<NameUni.length ; l++)
                {
                    System.out.println("\n"+NameUni[l] + "\n---------------");
                }
                System.out.format("name darse (%d) ra baraye Erae vard konid : " , i+1);
                String NameErae = input.next();
                
                for(int j = 0 ; j<NameUni.length ; j++)
                {
                    if(NameErae.equals(NameUni[j]))
                    {
                        NameUniEra[i]=NameUni[j];
                        CollegeUniEra[i]= CollegeUni[j];
                        CodeUniEra[i]= CodeUni[j];
                        System.out.println("\ncode gp ro vared kon : ");
                        CodeGp [i] = input.nextInt();
                        System.out.println("\nnimsal ra vared kon  99982 : ");
                        NumberYearEra[i]= input.nextInt();
                        
                        System.out.println("\n name ostad dars : ");
                        String NametchEra = input.next();
                        for (int k = 0; k < NameTch.length; k++)
                        {
                             if(NametchEra.equals(NameTch[k]))
                             {
                                IdTchEra[i]=IdTch[k];
                                NameTchEra[i]=NameTch[k];
                             }
  
                        }
                    }else
                    {
                        c++;
                    }                    
                }
                if(c == NameUni.length)
                {
                    System.out.println("not found !");
                }
            }
        }
    
        public static void EntekhabUni(int[] numEntkh ,int [] IdStd ,int [] IdStdEntkh , String[] NameUniEra , String[][] NameUniEntkh , int [] CodeUniEra ,int [][] CodeUniEntkh , int [] CodeGp ,  int [][] CodeGpEntkh , int [][] CodeEntkhStd ,String [] NameTchEra ,String [][] NameTchEntkh , int [][] NumberYearEntkh , Scanner input  )
        {
            for(int i = 0 ; i<IdStd.length ; i++)
            {
                System.out.format("\nEnter Id student %d : " , i+1);
                int IdEntkh = input.nextInt();
                
                for(int k = 0 ; k<IdStd.length ; k++)
                {
                    if(IdEntkh == IdStd[k] )
                    {
                        IdStdEntkh[i]=IdStd[k];
                    }
                }
                System.out.println("Enter the number of chosing unit : ");
                numEntkh[i] = input.nextInt();
                for(int m = 0 ; m<numEntkh[i] ; m++){
                    System.out.println("name darse Entekhabi ra vared konid : ");
                    String NameEntkh = input.next();
                    for(int j=0 ; j <NameUniEra.length ; j++)
                    {
                        if(NameEntkh.equals(NameUniEra[j]))
                        {
                            NameUniEntkh[i][m]= NameUniEra[j];
                            CodeUniEntkh[i][m]=CodeUniEra[j];
                            CodeGpEntkh[i][m]=CodeGp[j];
                            System.out.println("\nnimsal ra vared kon  99982 : ");
                            NumberYearEntkh[i][m]=input.nextInt();
                            System.out.println("\n code danshjo  : ");
                            CodeEntkhStd[i][m]= input.nextInt();
                            NameTchEntkh[i][m]= NameTchEra[j];
                        }
                   
                    }      
                }
            }
        }
        public static void MoshahedUniEntkh(int[] numEntkh , int [] IdStdEntkh ,  String[][] NameUniEntkh , int [][] CodeUniEntkh ,  int [][] CodeGpEntkh  ,String [][] NameTchEntkh , Scanner input )
        {
            System.out.println("Enter the Id student : ");
            int Idstd = input.nextInt();
            int c = 0;
            for(int i=0 ; i<IdStdEntkh.length ; i++)
            {
                if(Idstd == IdStdEntkh[i])
                    
                {
                    for(int j = 0 ; j<numEntkh[i] ; j++)
                    {
                        System.out.println("Name of unit "+ j +" : "+NameUniEntkh[i][j] + "\n" +"code of unit " + j +" : " +CodeUniEntkh[i][j] + "\n" +"code Group " + j +" : " +CodeGpEntkh[i][j] + "\n"+"name of ostad " + j +" : " +NameTchEntkh[i][j]+"\n----------------\n" );
                    }
                }else{
                    c++;
                }
                    
            }if(c>=IdStdEntkh.length){
                System.out.println("not found !");
            }
        }
        public static void MoshahedeUniEra( String[] CollegeUniEra , String[] NameUniEra  ,int [] CodeUniEra ,int [] CodeGp ,int [] IdTchEra , int[] NumberYearEra  ,int NumberErae, Scanner input)
        {
            int c=0;
            System.out.println("Enter the name of College : ");
            String namecollege = input.next();
            for(int i=0 ; i<CollegeUniEra.length ; i++)
            {
                if(namecollege.equals(CollegeUniEra[i]))
                {
                    System.out.println("name of unit : "+ NameUniEra[i] + " \n" + "code of unit : " +CodeUniEra[i] + " \n" + "code of Group : "+CodeGp[i] + " \n" +" code ostad : " +IdTchEra[i] + " \n"+ "nimsal voroudi : "+ NumberYearEra[i] + "\n----------------\n");
                }else{
                    c++;
                }
            }if(c>=CollegeUniEra.length ){
                System.out.println("not found !");
            }
               
        }
}

