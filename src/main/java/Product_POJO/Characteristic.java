package Product_POJO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Characteristic{

	@JsonProperty("diamonds")
	private Object diamonds;

	@JsonProperty("jewelry-catalog")
	private Object jewelryCatalog;

	@JsonProperty("wearable-electronics")
	private Object wearableElectronics;

	@JsonProperty("diamant-jewelry-catalog")
	private DiamantJewelryCatalog diamantJewelryCatalog;

	@JsonProperty("watch-catalog")
	private Object watchCatalog;

	@JsonProperty("silverware")
	private Object silverware;

	public Characteristic() {
	}

	public Characteristic(Object diamonds, Object jewelryCatalog, Object wearableElectronics, DiamantJewelryCatalog diamantJewelryCatalog, Object watchCatalog, Object silverware) {
		this.diamonds = diamonds;
		this.jewelryCatalog = jewelryCatalog;
		this.wearableElectronics = wearableElectronics;
		this.diamantJewelryCatalog = diamantJewelryCatalog;
		this.watchCatalog = watchCatalog;
		this.silverware = silverware;
	}

	public Object getDiamonds(){
		return diamonds;
	}

	public Object getJewelryCatalog(){
		return jewelryCatalog;
	}

	public Object getWearableElectronics(){
		return wearableElectronics;
	}

	public DiamantJewelryCatalog getDiamantJewelryCatalog(){
		return diamantJewelryCatalog;
	}

	public Object getWatchCatalog(){
		return watchCatalog;
	}

	public Object getSilverware(){
		return silverware;
	}
}