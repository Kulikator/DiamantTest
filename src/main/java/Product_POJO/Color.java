package Product_POJO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Color{

	@JsonProperty("name")
	private String name;

	@JsonProperty("value")
	private String value;

	public Color() {
	}

	public Color(String name, String value) {
		this.name = name;
		this.value = value;
	}

	public String getName(){
		return name;
	}

	public String getValue(){
		return value;
	}
}