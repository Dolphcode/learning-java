package Chapter12.Shulker;

public class ShulkerBox {
	
	private boolean toggleBox = false;
	protected Shulker shulker = new Shulker();
	
	// This is an inner class that can access everything in its outer class and the outer class can access everything inside the inner class
	// The inner class can only access data in the outer class it's tied to and vice versa
	public class Shulker {
		
		private int missileDamage = 20;
		
		public void missile() {
			if (toggleBox == true) {
				System.out.println("You're missile fired\nIt did " + missileDamage + " damage");
			} else {
				System.out.println("Couldn't fire a missile, sorry");
			}
		}
		
	}
	
	public void toggleArmor() {
		if (toggleBox == false) {
			toggleBox = true;
		} else {
			toggleBox = false;
		}
	}
	
}
