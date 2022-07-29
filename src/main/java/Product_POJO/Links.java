package Product_POJO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Links{

	@JsonProperty("self")
	private Self self;

	public Links(Self self) {
		this.self = self;
	}

	public Links() {
	}

	public Self getSelf(){
		return self;
	}
}