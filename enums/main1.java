enum Computer{
	DesktopPC(1000),Laptop(2000),miniPC(3000),server(4000);//All these are objects
	// 1000,2000,3000,4000 are the values passed to the objects as the constructors
	private int price = 0;
	Computer(int price){
		this.price = price;
	}
	//Now the price is a private datatype and so we need to assign the getters ans setters
	public int getPrice(){
		return price;
	}

}

class main1{
	public static void main(String[] args) {
		Computer s = Computer.DesktopPC;
		//System.out.print(s);
		//switch case

		int i = 2;

		switch(s){
		case DesktopPC :{
			System.out.println("DesktopPC"+s.getPrice());
			break;
		}
		case Laptop :{

			System.out.println("Laptop");
			break;
		}
		case miniPC :{
			
			System.out.println("miniPC");
			break;
		}
		case server :{
			
			System.out.println("server");
			break;
		}

		}
	}
}