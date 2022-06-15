public class Main {

	public static void main(String[] args) {
		// System.out.println("Instantiate objects here!");

		// Instantiate a melon type for each type of melon
		MelonType musk = new MelonType("musk", "Muskmelon", 1998, "green", true, true);
		MelonType cas = new MelonType("cas", "Casaba", 2003, "orange", false, false);
		MelonType cren = new MelonType("cren", "Crenshaw", 1996, "green", false, false);
		MelonType yw = new MelonType("yw", "Yellow Watermelon", 2013, "yellow", false, true);

		// Create an array to keep track of the melon types
		MelonType[] melonTypes = {musk, cas, cren, yw};

		// Instantiate each melon that is harvested
		Melon melon1 = new Melon(melonTypes[3], 8, 7, 2, "Sheila");
		Melon melon2 = new Melon(melonTypes[3], 3, 4, 2, "Sheila");
		Melon melon3 = new Melon(melonTypes[1], 10, 6, 35, "Sheila");
		Melon melon4 = new Melon(melonTypes[2], 8, 9, 35, "Michael");
		Melon melon5 = new Melon(melonTypes[2], 8, 2, 35, "Michael");
		Melon melon6 = new Melon(melonTypes[0], 6, 7, 4, "Michael");
		Melon melon7 = new Melon(melonTypes[3], 7, 10, 3, "Sheila");

		// Create an array to track all harvested melons
		Melon[] melons = {melon1, melon2, melon3, melon4, melon5, melon6, melon7};

		// Get the sellability report for each melon
		getSellabilityReport(melons);

	}

	// Print out information about each melon that was harvested and whether or not it was sellable
	public static void getSellabilityReport(Melon[] melons){

		// For each melon
		for (Melon melon : melons) {

			// Check if melon is sellable
			String sellable;

			if (melon.isSellable()) {

				sellable = "(CAN BE SOLD)";

			} else {

				sellable = "(NOT SELLABLE)";
			}

			// Format the output string
			String message = String.format("Harvested by %s from Field %d %s", melon.harvester, melon.field, sellable);

			// Print the report
			System.out.println(message);

		}
	}

}
