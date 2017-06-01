package com.training.abstractdemo;

public class EmployeeDemo {
	int id;
	String name;
	AddressDemo address;

	EmployeeDemo(int id, String name, AddressDemo address){
		this.id= id;
		this.name = name;
		this.address = address;
		
	}
	
 void display(){
		
		System.out.println(id + " " + name);
		System.out.println(address.city +"" + address.state + "" + address.zip);
		
	}
 
 public static void main(String[] args) {
	
	 AddressDemo adrs = new AddressDemo("charl" , "ass", 125);
	 AddressDemo adrss = new AddressDemo("ahs", "aksv", 124);
	 
	 EmployeeDemo emp = new EmployeeDemo(1,"chintu", adrs);
	 EmployeeDemo emp1 = new EmployeeDemo(2,"chinu", adrss);
	 
	 emp.display();
	 emp1.display();
	 
	 
}

}


