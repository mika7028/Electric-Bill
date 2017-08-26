package 電気料金;

class TieredRateTable extends TierTable{
	TieredRateTable(double... tiers){
		super(tiers);
	}
	double map(double amount){
		double charge = 0;
		for (int i = 0; i < pairs.length; i++){
			if(i + 1 < pairs.length && amount > pairs[i + 1][0]){
				charge += (pairs[i + 1][0] - pairs[i][0]) * pairs[i][1];
			} else {
				charge += (amount - pairs[i][0]) * pairs[i][1];
				break;
			}
		}
		return charge;
	}

}
