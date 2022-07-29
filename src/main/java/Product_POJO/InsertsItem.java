package Product_POJO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InsertsItem{

	@JsonProperty("quantity")
	private String quantity;

	@JsonProperty("cut")
	private Object cut;

	@JsonProperty("shape")
	private String shape;

	@JsonProperty("color")
	private Color color;

	@JsonProperty("purity")
	private Object purity;

	@JsonProperty("chromaticity")
	private Object chromaticity;

	@JsonProperty("weight")
	private String weight;

	@JsonProperty("type")
	private String type;

	public InsertsItem() {
	}

	public InsertsItem(String quantity, Object cut, String shape, Color color, Object purity, Object chromaticity, String weight, String type) {
		this.quantity = quantity;
		this.cut = cut;
		this.shape = shape;
		this.color = color;
		this.purity = purity;
		this.chromaticity = chromaticity;
		this.weight = weight;
		this.type = type;
	}

	public String getQuantity(){
		return quantity;
	}

	public Object getCut(){
		return cut;
	}

	public String getShape(){
		return shape;
	}

	public Color getColor(){
		return color;
	}

	public Object getPurity(){
		return purity;
	}

	public Object getChromaticity(){
		return chromaticity;
	}

	public String getWeight(){
		return weight;
	}

	public String getType(){
		return type;
	}
}