class Franc extends Money {   
   //private int amount;					

		
	  Franc(int amount, String currency) {
	      super(amount, currency);
	   }
	     
	   Money times(int multiplier)  {
	      return Money.franc(amount * multiplier);
	   }
	   String currency() {
	      return currency;
	   }
	   
   
    public boolean equals(Object object) {					
       if (object instanceof Franc) {
    	   Franc franc = (Franc) object;      
    	   return amount == franc.amount;
       }
       return false;
     }					
}