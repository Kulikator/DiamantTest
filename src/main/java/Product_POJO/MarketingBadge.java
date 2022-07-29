package Product_POJO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MarketingBadge{

	@JsonProperty("secondsStartedAt")
	private int secondsStartedAt;

	@JsonProperty("sticker_link")
	private String stickerLink;

	@JsonProperty("sticker_description")
	private String stickerDescription;

	@JsonProperty("sticker_background_color")
	private String stickerBackgroundColor;

	@JsonProperty("secondsEndedAt")
	private int secondsEndedAt;

	@JsonProperty("sticker_text_color")
	private String stickerTextColor;

	@JsonProperty("sticker_type")
	private String stickerType;

	@JsonProperty("sticker_text")
	private String stickerText;

	public MarketingBadge(int secondsStartedAt, String stickerLink, String stickerDescription, String stickerBackgroundColor, int secondsEndedAt, String stickerTextColor, String stickerType, String stickerText) {
		this.secondsStartedAt = secondsStartedAt;
		this.stickerLink = stickerLink;
		this.stickerDescription = stickerDescription;
		this.stickerBackgroundColor = stickerBackgroundColor;
		this.secondsEndedAt = secondsEndedAt;
		this.stickerTextColor = stickerTextColor;
		this.stickerType = stickerType;
		this.stickerText = stickerText;
	}

	public MarketingBadge() {
	}

	public int getSecondsStartedAt(){
		return secondsStartedAt;
	}

	public String getStickerLink(){
		return stickerLink;
	}

	public String getStickerDescription(){
		return stickerDescription;
	}

	public String getStickerBackgroundColor(){
		return stickerBackgroundColor;
	}

	public int getSecondsEndedAt(){
		return secondsEndedAt;
	}

	public String getStickerTextColor(){
		return stickerTextColor;
	}

	public String getStickerType(){
		return stickerType;
	}

	public String getStickerText(){
		return stickerText;
	}
}