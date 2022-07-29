package Product_POJO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Collection{

	@JsonProperty("image_app")
	private Object imageApp;

	@JsonProperty("name")
	private Object name;

	@JsonProperty("id")
	private Object id;

	public Collection() {
	}

	public Collection(Object imageApp, Object name, Object id) {
		this.imageApp = imageApp;
		this.name = name;
		this.id = id;
	}

	public Object getImageApp(){
		return imageApp;
	}

	public Object getName(){
		return name;
	}

	public Object getId(){
		return id;
	}
}