package Product_POJO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Metal{

	@JsonProperty("plating")
	private Object plating;

	@JsonProperty("color")
	private String color;

	@JsonProperty("type")
	private String type;

	@JsonProperty("probe")
	private String probe;

	public Metal() {
	}

	public Metal(Object plating, String color, String type, String probe) {
		this.plating = plating;
		this.color = color;
		this.type = type;
		this.probe = probe;
	}

	public Object getPlating(){
		return plating;
	}

	public String getColor(){
		return color;
	}

	public String getType(){
		return type;
	}

	public String getProbe(){
		return probe;
	}
}