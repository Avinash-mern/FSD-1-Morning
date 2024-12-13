class Solution{
	static int fullPrime(int N){
	    //code here
	    if(N == 1){
	        return 0;
	    }
	    boolean check = true; //number is prime
	    for(int i = 2; i<N; i++){
	        if(N % i == 0){
	            check = false;
	            break;
	        }
	    }
	    //23
	    if(check == true){
	        while(N != 0){
	            int rem = N % 10; 
	            if(rem == 1){
	                return 0;
	            }
	            for(int i = 2; i<rem; i++){
	                if(rem % i == 0){
	                    check = false;
	                    break;
	                }
	            }
	            N = N / 10;
	            
	        }
	        if(check == true ){
	            return 1;
	        }
	        else{
	            return 0;
	        }
	    }
	    else{
	        return 0;
	    }
	}
}
