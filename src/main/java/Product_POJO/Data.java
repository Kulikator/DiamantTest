package Product_POJO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data{

	@JsonProperty("attributes")
	private Attributes attributes;

	@JsonProperty("links")
	private Links links;

	@JsonProperty("id")
	private String id;

	@JsonProperty("type")
	private String type;

	public Data() {
	}

	public Data(Attributes attributes, Links links, String id, String type) {
		this.attributes = attributes;
		this.links = links;
		this.id = id;
		this.type = type;
	}

	public Attributes getAttributes(){
		return attributes;
	}

	public Links getLinks(){
		return links;
	}

	public String getId(){
		return id;
	}

	public String getType(){
		return type;
	}
}