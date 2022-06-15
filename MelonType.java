public class MelonType {

	public static void main(String[] args) {
		System.out.println("melon type defined");
	}

    String code;
    int firstHarvest;
    String color;
    boolean isSeedless;
    boolean isBestseller;
    String name;

	public MelonType (String code,
		String name,
		int firstHarvest,
		String color,
		boolean isSeedless,
		boolean isBestseller) {

		this.code = code;
	    this.firstHarvest = firstHarvest;
	    this.color = color;
	    this.isSeedless = isSeedless;
	    this.isBestseller = isBestseller;
	    this.name = name;
	}


}
