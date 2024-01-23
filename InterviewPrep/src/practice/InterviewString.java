package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class InterviewString {

	
public static void main(String...s) {
	
	String std="abc";
	String str=new String("abc");
	String ste="abc";
	
	System.out.println(std.equals(str));
	System.out.println(std==str);
	System.out.println(std==ste);
	//String imutablity
	
	std=std+"qrs";
	System.out.println(std);
	System.out.println(std==ste);
	
	Ram r1=new Ram();
	r1.setSpouse("Sita");
	r1.setStory("Ramayan");
	Ram r2=new Ram();
	r2.setSpouse("Sita");
	r2.setStory("Ramayan");
	Ram r3=new Ram();
	r3.setSpouse("Sita");
	r3.setStory("Ramayan Valmiki");
	
	System.out.println((r1==r2)+"Comparing with ==");
	System.out.println(r1.equals(r2)+" Comapring with equals");
	
	Map<Ram,Integer> map=new HashMap<Ram,Integer>();
	map.put( r1,1);
	//map.put( r3,3);
	map.put( r2,2);
	
	System.out.println(map);
	//map.forEach((i,j)->System.out.println(i+" "+j.getStory()));
//map.forEach((i,j)->System.out.print(i,j.getStory()));
}


}
class Ram{
	
private	String story;

private String spouse;

public String getStory() {
	return story;
}

public void setStory(String story) {
	this.story = story;
}

public String getSpouse() {
	return spouse;
}

public void setSpouse(String spouse) {
	this.spouse = spouse;
}

@Override
public String toString() {
	return "Ram [story=" + story + ", spouse=" + spouse + "]";
}

@Override
public int hashCode() {
	return Objects.hash(spouse, story);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Ram other = (Ram) obj;
	return Objects.equals(spouse, other.spouse) && Objects.equals(story, other.story);
}







}


