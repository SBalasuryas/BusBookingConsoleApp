package busrevs;

public class Bus {
	
	private int Busno;
	private boolean Ac;
	private int Capacity;
	 ///to access and return get  to set for change
	
	Bus(int no,boolean Ac,int Capacity){
		this.Busno = no;
		this.Ac = Ac;
		this.Capacity = Capacity;
		
	}

	public int getBusno() {  //Accessor method
		return Busno;
	}

	public void setBusno(int busno) { //Mutator method
		Busno = busno;
	}

	public boolean isAc() {
		return Ac;
	}

	public void setAc(boolean ac) {
		Ac = ac;
	}

	public int getCapacity() {
		return Capacity;
	}

	public void setCapacity(int capacity) {
		Capacity = capacity;
	}
	
	//invoke with object to display bus info in main 
	public void displayBusinfo(){
		System.out.println("Bus No : "+ Busno+",      "+" Ac : "+ Ac +",  " +" Capacity of Bus : "+Capacity+".");
	}
	
	
}
