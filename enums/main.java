enum status{
	Running,Using,Prepareing,Success;
}

class main{
	public static void main(String[] args) {
		status s = status.Success;
		System.out.print(s);

		status[] ss = status.values();

		System.out.print(ss[0]);

		//switch case

		int i = 2;

		switch(s){
		case Running :{
			System.out.println("Running");
			break;
		}
		case Using :{

			System.out.println("Using");
			break;
		}
		case Prepareing :{
			
			System.out.println("Prepareing");
			break;
		}
		case Success :{
			
			System.out.println("Success");
			break;
		}

		}
	}
}