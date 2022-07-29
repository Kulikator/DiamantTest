package Product_POJO;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Attributes{

	@JsonProperty("basket")
	private Object basket;

	@JsonProperty("sum-comments")
	private int sumComments;

	@JsonProperty("bonus")
	private int bonus;

	@JsonProperty("video-on-model")
	private Object videoOnModel;

	@JsonProperty("rating")
	private int rating;

	@JsonProperty("description")
	private String description;

	@JsonProperty("discount")
	private int discount;

	@JsonProperty("delivery-info")
	private List<DeliveryInfoItem> deliveryInfo;

	@JsonProperty("express")
	private boolean express;

	@JsonProperty("video")
	private Object video;

	@JsonProperty("type")
	private String type;

	@JsonProperty("photos")
	private List<String> photos;

	@JsonProperty("recommendations")
	private List<Object> recommendations;

	@JsonProperty("characteristic")
	private Characteristic characteristic;

	@JsonProperty("new-year")
	private boolean newYear;

	@JsonProperty("sizes")
	private Sizes sizes;

	@JsonProperty("price")
	private int price;

	@JsonProperty("country-price")
	private CountryPrice countryPrice;

	@JsonProperty("stock")
	private boolean stock;

	@JsonProperty("brand")
	private String brand;

	@JsonProperty("marketing-badge")
	private MarketingBadge marketingBadge;

	@JsonProperty("old-price")
	private int oldPrice;

	@JsonProperty("promocodes")
	private Promocodes promocodes;

	@JsonProperty("visible")
	private boolean visible;

	@JsonProperty("collection")
	private Collection collection;

	@JsonProperty("label")
	private Object label;

	@JsonProperty("is-favorites")
	private boolean isFavorites;

	@JsonProperty("article")
	private String article;

	@JsonProperty("url-code")
	private String urlCode;

	@JsonProperty("badges")
	private List<Object> badges;

	@JsonProperty("day-to-day")
	private boolean dayToDay;

	@JsonProperty("meta-description")
	private String metaDescription;

	@JsonProperty("breadcrumb")
	private List<Object> breadcrumb;

	@JsonProperty("meta-title")
	private String metaTitle;

	@JsonProperty("gia-certificate")
	private boolean giaCertificate;

	@JsonProperty("name")
	private String name;

	@JsonProperty("category")
	private String category;

	public Attributes() {
	}

	public Attributes(Object basket, int sumComments, int bonus, Object videoOnModel, int rating, String description, int discount, List<DeliveryInfoItem> deliveryInfo, boolean express, Object video, String type, List<String> photos, List<Object> recommendations, Characteristic characteristic, boolean newYear, Sizes sizes, int price, CountryPrice countryPrice, boolean stock, String brand, MarketingBadge marketingBadge, int oldPrice, Promocodes promocodes, boolean visible, Collection collection, Object label, boolean isFavorites, String article, String urlCode, List<Object> badges, boolean dayToDay, String metaDescription, List<Object> breadcrumb, String metaTitle, boolean giaCertificate, String name, String category) {
		this.basket = basket;
		this.sumComments = sumComments;
		this.bonus = bonus;
		this.videoOnModel = videoOnModel;
		this.rating = rating;
		this.description = description;
		this.discount = discount;
		this.deliveryInfo = deliveryInfo;
		this.express = express;
		this.video = video;
		this.type = type;
		this.photos = photos;
		this.recommendations = recommendations;
		this.characteristic = characteristic;
		this.newYear = newYear;
		this.sizes = sizes;
		this.price = price;
		this.countryPrice = countryPrice;
		this.stock = stock;
		this.brand = brand;
		this.marketingBadge = marketingBadge;
		this.oldPrice = oldPrice;
		this.promocodes = promocodes;
		this.visible = visible;
		this.collection = collection;
		this.label = label;
		this.isFavorites = isFavorites;
		this.article = article;
		this.urlCode = urlCode;
		this.badges = badges;
		this.dayToDay = dayToDay;
		this.metaDescription = metaDescription;
		this.breadcrumb = breadcrumb;
		this.metaTitle = metaTitle;
		this.giaCertificate = giaCertificate;
		this.name = name;
		this.category = category;
	}

	public Object getBasket(){
		return basket;
	}

	public int getSumComments(){
		return sumComments;
	}

	public int getBonus(){
		return bonus;
	}

	public Object getVideoOnModel(){
		return videoOnModel;
	}

	public int getRating(){
		return rating;
	}

	public String getDescription(){
		return description;
	}

	public int getDiscount(){
		return discount;
	}

	public List<DeliveryInfoItem> getDeliveryInfo(){
		return deliveryInfo;
	}

	public boolean isExpress(){
		return express;
	}

	public Object getVideo(){
		return video;
	}

	public String getType(){
		return type;
	}

	public List<String> getPhotos(){
		return photos;
	}

	public List<Object> getRecommendations(){
		return recommendations;
	}

	public Characteristic getCharacteristic(){
		return characteristic;
	}

	public boolean isNewYear(){
		return newYear;
	}

	public Sizes getSizes(){
		return sizes;
	}

	public int getPrice(){
		return price;
	}

	public CountryPrice getCountryPrice(){
		return countryPrice;
	}

	public boolean isStock(){
		return stock;
	}

	public String getBrand(){
		return brand;
	}

	public MarketingBadge getMarketingBadge(){
		return marketingBadge;
	}

	public int getOldPrice(){
		return oldPrice;
	}

	public Promocodes getPromocodes(){
		return promocodes;
	}

	public boolean isVisible(){
		return visible;
	}

	public Collection getCollection(){
		return collection;
	}

	public Object getLabel(){
		return label;
	}

	public boolean isIsFavorites(){
		return isFavorites;
	}

	public String getArticle(){
		return article;
	}

	public String getUrlCode(){
		return urlCode;
	}

	public List<Object> getBadges(){
		return badges;
	}

	public boolean isDayToDay(){
		return dayToDay;
	}

	public String getMetaDescription(){
		return metaDescription;
	}

	public List<Object> getBreadcrumb(){
		return breadcrumb;
	}

	public String getMetaTitle(){
		return metaTitle;
	}

	public boolean isGiaCertificate(){
		return giaCertificate;
	}

	public String getName(){
		return name;
	}

	public String getCategory(){
		return category;
	}
}