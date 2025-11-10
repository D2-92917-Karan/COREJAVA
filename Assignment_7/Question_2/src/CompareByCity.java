import java.util.Comparator;

public class CompareByCity implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		int diff=o2.getCity().compareTo(o1.getCity());
		return diff;
	}

}
