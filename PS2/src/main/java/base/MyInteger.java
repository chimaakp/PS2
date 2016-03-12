package base;

private class MyInteger {
	
	int iValue;
	//constuctor
	MyInteger(int iValue){
		iValue = this.iValue;
	}
	
	//getter
	public int getiValue(){
		return iValue;		
	}
	
	//methods
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


	
	
	//int methods
	public static boolean isEven(int e){
		int etest = e % 2;
		if(etest == 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static boolean isOdd(int o){
		int otest = o % 2;
		if(otest == 1){
			return true;
		}
		else{
			return false;
		}
	}		
	
	
	public static boolean isPrime(int pri) {
		for(int p = 2; p < (pri / 2) ; p++) {
			if(pri % p == 0)
				return false;
		}
		return true;
		
	}	
	
	
	//MyInteger methods
	public static boolean isEven(MyInteger eve){
		return eve.isEven();
		
	}
	
	public static boolean isOdd(MyInteger odd){
		return odd.isOdd();
		
	}
	
	public static boolean isPrime(MyInteger prim){
		return prim.isPrime();
	}

	
	//equals methods
	public boolean equals(int eq){
		 if( eq == iValue){
			 return true;
		 }
		 else{
			 return false;
		 }
	}
	
	public boolean equals(MyInteger iValue){
		return true;
	}
}	
