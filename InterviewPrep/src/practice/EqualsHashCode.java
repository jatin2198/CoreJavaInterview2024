package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public class EqualsHashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String str="Jatin"; String std=new String("Jatin");
		 * 
		 * System.out.println("Comparing with"+" == "+(str==std));//false
		 * System.out.println("Comparing with equals= "+str.equals(std));//true
		 */

		People people=new People();
		people.setName("Jatin Arya");
		people.setAddress("Delhi");
		
		People people2=new People();
		people2.setName("Shiva Arya");
		people2.setAddress("Delhi");
		
		System.out.println("Comparing with"+" == "+(people==people2));
		System.out.println("Comparing with equals= "+people.equals(people2));
	
		Map<People,Integer> pmap=new ConcurrentHashMap<People,Integer>();
		pmap.put(people,1 );
		pmap.put(people2,2 );
		People people3=new People();
		people3.setName("Shivam");
		people3.setAddress("Rockistan");
		
		pmap.forEach((i,j)->{
			System.out.println("Key= "+i+" "+j);
			pmap.put(people3, 3);
		});
	}

}
class People{
	
	private String name;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "People [name=" + name + ", address=" + address + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		People other = (People) obj;
		return Objects.equals(address, other.address) && Objects.equals(name, other.name);
	}
	
	
}