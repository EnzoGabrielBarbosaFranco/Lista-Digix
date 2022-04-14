public class Ex22 {
    public static void main(String[] args) {
        int Seconds = 0 ;
	    int Minutes = 0 ;                                 
	    int Hours = 0 ;

	    if ( Seconds>=60 )  Minutes = Minutes+1 ;
	    if ( Minutes > 0 )   Seconds = Seconds-60 ;
	    if ( Minutes>=60) Hours = Hours+1 ;                
	    if (Hours >0) Minutes=Minutes-60; 

	    System.out.printf("O número de horas é %d, de minutos é %d e de segundos é %d",Hours, Minutes, Seconds) ;
}
    }