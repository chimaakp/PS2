package base;

public class MyInteger {
	
	int iValue;
	
	MyInteger(){
		
	}
	
	public int getiValue(){
		return iValue;		
	}
	
	public boolean isEven(){
		int etest = iValue % 2;
		if(etest == 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean isOdd(){
		int otest = iValue % 2;
		if(otest == 1){
			return true;
		}
		else{
			return false;
		}
	}		
	
	
	public boolean isPrime(){
		int ptest = iValue;
		for(int p = 1; p < (iValue / 2 ); ++p){
			if( ptest % p == 0){
				return false;
			}
			else{
				return true;
			}
		}
		
	}
}
