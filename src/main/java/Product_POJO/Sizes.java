package Product_POJO;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Sizes{

	@JsonProperty("available_sizes")
	private List<Object> availableSizes;

	@JsonProperty("available")
	private boolean available;

	@JsonProperty("not_available_sizes")
	private List<Object> notAvailableSizes;

	public Sizes() {
	}

	public Sizes(List<Object> availableSizes, boolean available, List<Object> notAvailableSizes) {
		this.availableSizes = availableSizes;
		this.available = available;
		this.notAvailableSizes = notAvailableSizes;
	}

	public List<Object> getAvailableSizes(){
		return availableSizes;
	}

	public boolean isAvailable(){
		return available;
	}

	public List<Object> getNotAvailableSizes(){
		return notAvailableSizes;
	}
}