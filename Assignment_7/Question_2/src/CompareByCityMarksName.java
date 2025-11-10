import java.util.Comparator;

public class CompareByCityMarksName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		int diff=o2.getCity().compareTo(o1.getCity());
		if(diff==0) 
			diff= -Double.compare(o1.getMarks(),o2.getMarks());
		
		if(diff==0) 
			diff=o1.getName().compareTo(o2.getName());
		
		return diff;
	}

}
