package 電気料金;

class RatePlan {
	private final String name;
	private final double basicCharge;
	private final TierTable pricingTiers;

	RatePlan(String name, double basicCharge, TierTable pricingTiers){
		this.name = name;
		this.basicCharge = basicCharge;
		this.pricingTiers = pricingTiers;
	}
	String getName(){return name;}
	
	int getPrice(double amount){
		return(int) (basicCharge + pricingTiers.map(amount));
	}
}
