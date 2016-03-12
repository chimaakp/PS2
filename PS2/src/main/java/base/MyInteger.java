package base;

public class MyInteger {
	
	int iValue;
	
	MyInteger(int iValue){
		iValue = this.iValue;
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
	
	
	public boolean isPrime() {
		for(int p = 2; p < (iValue / 2) ; p++) {
			if(iValue % p == 0)
				return false;
		}
		return true;
		
	}

	
	
	
	
	
}
