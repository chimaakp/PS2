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
		
	}
	
	public boolean isPrime(){
		
	}
}
