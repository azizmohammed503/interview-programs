package com.aziz.arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class removedeuplicatesinobj {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp1 b1 = new Emp1(1, "Aziz", 74554);
		Emp1 b2 = new Emp1(4, "ram",3566);
	    Emp1 b3 = new Emp1(1, "Aziz",74554);
	    Emp1 b4 = new Emp1(1, "Aziz", 746647);

	    List<Emp1> list = new ArrayList();
	    list.add(b1);
	    list.add(b2);
	    list.add(b3);
	    list.add(b4);
        System.out.println(list);
	    //Removing Duplicates;
	    //Set<Emp1> s= new LinkedHashSet<Emp1>(list);
	    //System.out.println(s);
	    
		/* Java 8 */
	    List<Emp1> personsWithoutDuplicates = list.stream().distinct().collect(Collectors.toList());
	    System.out.println(personsWithoutDuplicates);

	    Set<String> nameSet = new HashSet<>();
	    List<Emp1> employeesDistinctByName = list.stream()
	                .filter(e -> nameSet.add(e.getName()))
	                .collect(Collectors.toList());
	    
	    Set deptSet = list.stream()
                .collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Emp1::getName))));
        deptSet.forEach(dept -> System.out.println(dept));
	}

}
class Emp1{
	private Integer id;
	private String name;
	private Integer salary;
	Emp1(Integer i,String str, Integer salary){
		this.id=i;
		this.name=str;
		this.salary = salary;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Blog other = (Blog) obj;
		if (id == null) {
			if (other.i != null)
				return false;
		} else if (!id.equals(other.i))
			return false;
		if (name == null) {
			if (other.str != null)
				return false;
		} else if (!name.equals(other.str))
			return false;
		return true;*/
		
		
		if(obj instanceof Emp1){
			Emp1 e1=(Emp1) obj;
			
			return e1.id==this.id && e1.salary.equals(this.salary);
			/*String stri=""+e1.i;
			return stri.equals(e1.str);*/
		}
		
		return false;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp1 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
