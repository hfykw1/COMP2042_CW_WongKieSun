package model.MenuModels;

public enum LEVEL {

	LAZY("view/ViewResources/levelchooser/FrogA.png"),
	AVERAGE("view/ViewResources/levelchooser/FrogB.png"),
	CRAZY("view/ViewResources/levelchooser/FrogC.png");
	
	
	private String urlLevel;
	
	private LEVEL(String urlLevel) {
		this.urlLevel= urlLevel;
	}
	
	public String getUrl() {
		return this.urlLevel;
	}
	
	public String getLevel() {
		return this.name();
	}
}
