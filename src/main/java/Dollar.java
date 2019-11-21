class Dollar extends Money {
   //int amount;
   Dollar(int amount) {
      this.amount= amount;
   }
   Dollar times(int multiplier) {
      Dollextends ar d = new Dollar(amount * multiplier);
      
      return d;
   }
   @Override
   public boolean equals(Object object)  {
	   Dollar dollar = (Dollar) object;
	   return amount == dollar.amount;
	}
}	