class Dollar extends Money {

	 Dollar(int amount, String currency)  {
	      super(amount, currency);
	   }
		
	   Money times(int multiplier)  {
	      return Money.dollar(amount * multiplier);
	   }	
	
	   String currency() {
	      return currency;
	   }

	   
   @Override
   public boolean equals(Object object)  {
	   if (object instanceof Dollar) {
		   Dollar dollar = (Dollar) object;
		   return amount == dollar.amount;
	   }
	   return false;
	}
}	