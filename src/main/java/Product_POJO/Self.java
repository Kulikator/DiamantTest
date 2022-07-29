package Product_POJO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Self{

	@JsonProperty("href")
	private String href;

	public Self(String href) {
		this.href = href;
	}

	public Self() {
	}

	public String getHref(){
		return href;
	}
}