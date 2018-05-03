import java.util.Scanner;

public class xToPowN {

public static int power(int mentica,  int index)
	
{

		if(mentica>=1 && mentica<=1000){
	    
	if( index == 0)
	        
		return 1;
	    
        else if (index%2 == 0)
	        
		return power(mentica, index/2)*power(mentica, index/2);
	    
		else
	        
		return mentica*power(mentica, index/2)*power(mentica, index/2);
		
	}
		
		else 
			
		return 0;
	 
	
	}
	 
	

}
