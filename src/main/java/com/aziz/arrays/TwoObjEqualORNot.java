package com.aziz.arrays;

public class TwoObjEqualORNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp e1=new Emp(1, "1");
		
		Emp e2=new Emp(11, "11");
		
		if(e1.equals(e2)){
			System.out.println("equal"); 
			
		}else{
			System.out.println("not equal"); 
		}
		

	}

}

class Emp{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		/*if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;*/
		
		if(obj instanceof Emp){
			Emp e1=(Emp) obj;
			
			//return e1.id==this.id && e1.name.equals(this.name);
			String str=""+e1.id;
			return str.equals(e1.name);
		}
		return false;
	}
	
	
}
