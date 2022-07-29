package Product_POJO;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DiamantJewelryCatalog{

	@JsonProperty("weaving-type")
	private String weavingType;

	@JsonProperty("wire-diameter")
	private String wireDiameter;

	@JsonProperty("zodiac")
	private String zodiac;

	@JsonProperty("metal")
	private Metal metal;

	@JsonProperty("weight")
	private String weight;

	@JsonProperty("is-rings")
	private boolean isRings;

	@JsonProperty("hollow")
	private String hollow;

	@JsonProperty("reasons_for_purchase_props")
	private String reasonsForPurchaseProps;

	@JsonProperty("colors")
	private List<Object> colors;

	@JsonProperty("diameter-congo")
	private String diameterCongo;

	@JsonProperty("for-whom")
	private String forWhom;

	@JsonProperty("assortment_project")
	private String assortmentProject;

	@JsonProperty("is-sized")
	private boolean isSized;

	@JsonProperty("proportions")
	private Proportions proportions;

	@JsonProperty("complect")
	private List<Object> complect;

	@JsonProperty("inserts")
	private List<InsertsItem> inserts;

	@JsonProperty("earring-clasp")
	private String earringClasp;

	@JsonProperty("icon-saint")
	private String iconSaint;

	public DiamantJewelryCatalog() {
	}

	public DiamantJewelryCatalog(String weavingType, String wireDiameter, String zodiac, Metal metal, String weight, boolean isRings, String hollow, String reasonsForPurchaseProps, List<Object> colors, String diameterCongo, String forWhom, String assortmentProject, boolean isSized, Proportions proportions, List<Object> complect, List<InsertsItem> inserts, String earringClasp, String iconSaint) {
		this.weavingType = weavingType;
		this.wireDiameter = wireDiameter;
		this.zodiac = zodiac;
		this.metal = metal;
		this.weight = weight;
		this.isRings = isRings;
		this.hollow = hollow;
		this.reasonsForPurchaseProps = reasonsForPurchaseProps;
		this.colors = colors;
		this.diameterCongo = diameterCongo;
		this.forWhom = forWhom;
		this.assortmentProject = assortmentProject;
		this.isSized = isSized;
		this.proportions = proportions;
		this.complect = complect;
		this.inserts = inserts;
		this.earringClasp = earringClasp;
		this.iconSaint = iconSaint;
	}

	public String getWeavingType(){
		return weavingType;
	}

	public String getWireDiameter(){
		return wireDiameter;
	}

	public String getZodiac(){
		return zodiac;
	}

	public Metal getMetal(){
		return metal;
	}

	public String getWeight(){
		return weight;
	}

	public boolean isIsRings(){
		return isRings;
	}

	public String getHollow(){
		return hollow;
	}

	public String getReasonsForPurchaseProps(){
		return reasonsForPurchaseProps;
	}

	public List<Object> getColors(){
		return colors;
	}

	public String getDiameterCongo(){
		return diameterCongo;
	}

	public String getForWhom(){
		return forWhom;
	}

	public String getAssortmentProject(){
		return assortmentProject;
	}

	public boolean isIsSized(){
		return isSized;
	}

	public Proportions getProportions(){
		return proportions;
	}

	public List<Object> getComplect(){
		return complect;
	}

	public List<InsertsItem> getInserts(){
		return inserts;
	}

	public InsertsItem getInsertsById(int i){
		return inserts.get(i);
	}


	public String getEarringClasp(){
		return earringClasp;
	}

	public String getIconSaint(){
		return iconSaint;
	}
}