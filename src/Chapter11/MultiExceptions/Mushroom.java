package Chapter11.MultiExceptions;

public abstract class Mushroom {
	
	//Here are some instance variables
	private final boolean isMagic;
	private final String type;
	private String color;
	
	public Mushroom() {
		isMagic = false;
		type = "Default Shroom";
		color = "Tan but even blander";
	}
	
	/**
	 * @param isMagical - Final instance variable determines if the mushroom is magical
	 * @param shroomColor - Determines the color of the mushroom
	 * @param type - Determines the type of mushroom
	 */
	public Mushroom(boolean isMagical, String shroomColor, String shroomType) {
		isMagic = isMagical;
		type = shroomType;
		color = shroomColor;
	}
	
	//Encapsulation stuff
	public final boolean getMagical() { return isMagic; }
	public final String getType() { return type; }
	public final String getColor() { return color; }
	public final void setColor(String changeColor) { color = changeColor; }
	
	public void recordData() {
		System.out.println("Species: " + type);
		System.out.println("Color: " + color);
		if (isMagic) {
			System.out.println("This mushroom has magical properties");
		} else {
			System.out.println("This mushroom does not have magical properties");
		}
	}
	

}
