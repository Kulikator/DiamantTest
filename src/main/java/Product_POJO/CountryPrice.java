package Product_POJO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CountryPrice{

	@JsonProperty("BY")
	private BY bY;

	@JsonProperty("AM")
	private AM aM;

	@JsonProperty("KG")
	private KG kG;

	@JsonProperty("KZ")
	private KZ kZ;

	public CountryPrice() {
	}

	public CountryPrice(BY bY, AM aM, KG kG, KZ kZ) {
		this.bY = bY;
		this.aM = aM;
		this.kG = kG;
		this.kZ = kZ;
	}

	public BY getBY(){
		return bY;
	}

	public AM getAM(){
		return aM;
	}

	public KG getKG(){
		return kG;
	}

	public KZ getKZ(){
		return kZ;
	}
}