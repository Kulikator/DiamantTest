package Product_POJO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Promocodes{

	@JsonProperty("deepening_discount")
	private boolean deepeningDiscount;

	@JsonProperty("promocode")
	private String promocode;

	@JsonProperty("discount")
	private int discount;

	public Promocodes() {
	}

	public Promocodes(boolean deepeningDiscount, String promocode, int discount) {
		this.deepeningDiscount = deepeningDiscount;
		this.promocode = promocode;
		this.discount = discount;
	}

	public boolean isDeepeningDiscount(){
		return deepeningDiscount;
	}

	public String getPromocode(){
		return promocode;
	}

	public int getDiscount(){
		return discount;
	}
}