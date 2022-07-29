package Product_POJO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Proportions{

	@JsonProperty("width")
	private String width;

	@JsonProperty("length")
	private String length;

	@JsonProperty("height")
	private String height;

	public Proportions() {
	}

	public Proportions(String width, String length, String height) {
		this.width = width;
		this.length = length;
		this.height = height;
	}

	public String getWidth(){
		return width;
	}

	public String getLength(){
		return length;
	}

	public String getHeight(){
		return height;
	}
}