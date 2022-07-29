package Product_POJO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeliveryInfoItem{

	@JsonProperty("is_show_in_product_card")
	private boolean isShowInProductCard;

	@JsonProperty("short_description")
	private String shortDescription;

	@JsonProperty("is_active")
	private boolean isActive;

	@JsonProperty("is_show_in_catalog")
	private boolean isShowInCatalog;

	@JsonProperty("icon")
	private String icon;

	@JsonProperty("description")
	private String description;

	@JsonProperty("id")
	private String id;

	@JsonProperty("sort")
	private int sort;

	@JsonProperty("type")
	private int type;

	@JsonProperty("title")
	private String title;

	public DeliveryInfoItem() {
	}

	public DeliveryInfoItem(boolean isShowInProductCard, String shortDescription, boolean isActive, boolean isShowInCatalog, String icon, String description, String id, int sort, int type, String title) {
		this.isShowInProductCard = isShowInProductCard;
		this.shortDescription = shortDescription;
		this.isActive = isActive;
		this.isShowInCatalog = isShowInCatalog;
		this.icon = icon;
		this.description = description;
		this.id = id;
		this.sort = sort;
		this.type = type;
		this.title = title;
	}

	public boolean isIsShowInProductCard(){
		return isShowInProductCard;
	}

	public String getShortDescription(){
		return shortDescription;
	}

	public boolean isIsActive(){
		return isActive;
	}

	public boolean isIsShowInCatalog(){
		return isShowInCatalog;
	}

	public String getIcon(){
		return icon;
	}

	public String getDescription(){
		return description;
	}

	public String getId(){
		return id;
	}

	public int getSort(){
		return sort;
	}

	public int getType(){
		return type;
	}

	public String getTitle(){
		return title;
	}
}