package Product_POJO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BY{

	@JsonProperty("price")
	private int price;

	@JsonProperty("old_price")
	private int oldPrice;

	@JsonProperty("discount")
	private int discount;

	public BY() {
	}

	public BY(int price, int oldPrice, int discount) {
		this.price = price;
		this.oldPrice = oldPrice;
		this.discount = discount;
	}

	public int getPrice(){
		return price;
	}

	public int getOldPrice(){
		return oldPrice;
	}

	public int getDiscount(){
		return discount;
	}
}