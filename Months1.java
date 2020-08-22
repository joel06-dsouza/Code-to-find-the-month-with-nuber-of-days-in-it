import java.util.Scanner;

 class Months1{
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int month,mon;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter Month Number from 1 to 12 (1 = Jan, and 12 = Dec) : ");
		month = sc.nextInt();
               
                mon = month;	
		Monthname(mon);
		DaysinaMonth(month);
	}
        public static void Monthname(int mon)
        {
                if(mon == 1) System.out.println("\nJanuary");
                if(mon == 2) System.out.println("\nFebruary");
                if(mon == 3) System.out.println("\nMarch");
                if(mon == 4) System.out.println("\nApril");
                if(mon == 5) System.out.println("\nMay");
                if(mon == 6) System.out.println("\nJune");
                if(mon == 7) System.out.println("\nJuly");
                if(mon == 8) System.out.println("\nAugust");
                if(mon == 9) System.out.println("\nSeptember");
                if(mon == 10) System.out.println("\nOctober");
                if(mon == 11) System.out.println("\nNovember");
                if(mon == 12) System.out.println("\nsDecember");
        }	
	public static void DaysinaMonth(int month)
	{		
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 )
		{
			System.out.println("\n 31 Days in this Month");  	
		}
		else if ( month == 4 || month == 6 || month == 9 || month == 11 )
		{
			System.out.println("\n 30 Days in this Month");  	
		}  
		else if ( month == 2 )
		{
			System.out.println("\n Either 28 or 29 Days in this Month");  	
		} 
		else
			System.out.println("\n Please enter Valid Number between 1 to 12");
	}
}
