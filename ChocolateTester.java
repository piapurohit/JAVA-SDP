public class ChocolateTester {
    int barCode;
	String name; 
	int weight;
	int cost;

	public int getBarCode() {
		return barCode;
	}

	public void setBarCode(int barCode) {
		this.barCode = barCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}



	ChocolateTester(){
		barCode=	101;
		name	="Cadbury";
		weight	=12;
		cost=	10;

	}

	public static void main(String[] args) {
		  // TODO Auto-generated method stub
		  //Create an object of chocolate
	      //Use getter methods to display the values
	      //Use setter methods to modify the values
	      //Use getter methods to display the modified values
		ChocolateTester choco=new ChocolateTester();
		System.out.println("The default chocolate details ");

		System.out.println(choco.getName());
		System.out.println(choco.getCost());
		System.out.println(choco.getWeight());
		System.out.println(choco.getBarCode());


		System.out.println("The New chocolate details ");
		choco.setBarCode(154);
		choco.setCost(500);
		choco.setName("AI_chocolate");
		choco.setWeight(10);

		System.out.println(choco.getName());
		System.out.println(choco.getCost());
		System.out.println(choco.getWeight());
		System.out.println(choco.getBarCode());

	}

}