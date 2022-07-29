package Product_POJO;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Product{

	@JsonProperty("data")
	private Data data;

	public Product() {
	}

	public Product(Data data) {
		this.data = data;
	}

	public Data getData(){
		return data;
	}

	public List<Object> getBreadcrumbs(){
		return getData().getAttributes().getBreadcrumb();
	}

	public String getInsertsTypeById(int i){
		return getData().getAttributes().getCharacteristic().getDiamantJewelryCatalog().getInsertsById(i).getType();
	}

	public List<InsertsItem> getInsertsList(){
		return getData().getAttributes().getCharacteristic().getDiamantJewelryCatalog().getInserts();
	}

	public String getMetalColour(){
		return getData().getAttributes().getCharacteristic().getDiamantJewelryCatalog().getMetal().getColor();
	}

	public String getMetalProbe(){
		return getData().getAttributes().getCharacteristic().getDiamantJewelryCatalog().getMetal().getProbe();
	}

	public String getWeight(){
		return getData().getAttributes().getCharacteristic().getDiamantJewelryCatalog().getWeight();
	}

	public int getPrice(){
		return getData().getAttributes().getPrice();
	}
}