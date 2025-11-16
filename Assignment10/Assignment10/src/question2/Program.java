package question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Program {

	static Scanner sc = new Scanner(System.in);

	public static void addDummyData(Set<Project> projectsSet) {
		Collections.addAll(projectsSet, new Project(1, "Train Reservation System", 2, 5000000, "Java"),
				new Project(2, "Airline Reservation System", 3, 6000000, ".NET"),
				new Project(4, "Online Grocery Shop", 6, 3000000, "Java"),
				new Project(5, "Online Book Shop", 2, 3000000, ".NET"),
				new Project(3, "Online Jewelry Shop", 4, 4000000, "Java"),
				new Project(2, "Bus Reservation System", 3, 3500000, "JS"));

		System.out.println("\n-------------------Projects added in the set------------------\n");
	}

	public static void addProject(Set<Project> projectsSet) {
		Project project = new Project();
		project.acceptRecord(sc);
		if (projectsSet.add(project)) {
			System.out.println("\n-------------project added!!------------------\n");
		} else {
			System.out.println("\n-------------------Error!!-------------------\n"
					+ "\tproject with same id already exists" + "\n-------------------Error!!-------------------\n");
		}
	}

	public static void displayAllProjects(Set<Project> projectsSet) {
		System.out.println("\nProjects : \n");
		projectsSet.forEach(project -> System.out.println(project));
		System.out.println("");
	}

	public static void deleteProject(Set<Project> projectsSet) {
		System.out.print("Enter project id : ");
		int projectID = sc.nextInt();
		boolean wasRemoved = projectsSet.removeIf((project) -> project.getId() == projectID);
		if (wasRemoved) {
			System.out.println("----------------project removed!!---------------\n");
		} else {
			System.out.println("\nProject not found!!\n");
		}
	}

	public static void copyFromSetToArrayList(Set<Project> projectsSet, List<Project> projectsList) {
		if (projectsList != null) {
			projectsList.clear();
			projectsList.addAll(projectsSet);
		} else {
			System.out.println("already exits in list");
		}
	}

	public static void displayAllProjectsFromList(List<Project> projectList) {
		if (projectList != null) {
			projectList.forEach(project -> System.out.println(project));
		} else {
			System.out.println("\nlist is empty!!\n");
		}
	}

	public static void sortByCostInArrayList(List<Project> projectList) {
		projectList.sort((a, b) -> Double.compare(a.getProjectCost(), b.getProjectCost()));
	}

	public static void findProjectsWithMaxTeamSize(List<Project> projectList) {
		Project project = Collections.max(projectList, (a, b) -> Integer.compare(a.getTeamSize(), b.getTeamSize()));
		System.out.println("project with max team size : " + project);
	}

	private static int menuList() {
		System.out.println("---------------------------");
		System.out.println("1. Add Dummy Data of Projects in the Set");
		System.out.println("2. Input a Project from user and add in Set");
		System.out.println("3. Display all Projects in Set");
		System.out.println("4. Delete a Project by Id from Set");
		System.out.println("5. Copy All Projects from Set to ArrayList");
		System.out.println("6. Display all Projects from List");
		System.out.println("7. Sort all Projects in List by cost");
		System.out.println("8. Find project with Max team size using Collections.max()");
		System.out.println("---------------------------\n");
		System.out.print("Enter choice : ");

		return sc.nextInt();
	}

	public static void main(String[] args) {
		Set<Project> projectsSet = new HashSet<>();
		List<Project> projectList = new ArrayList<>();
		;

		while (true) {
			int choice = menuList();

			switch (choice) {
			case 1:
				addDummyData(projectsSet);
				break;
			case 2:
				addProject(projectsSet);
				break;
			case 3:
				displayAllProjects(projectsSet);
				break;
			case 4:
				deleteProject(projectsSet);
				break;
			case 5:
				copyFromSetToArrayList(projectsSet, projectList);
				break;
			case 6:
				displayAllProjectsFromList(projectList);
				break;
			case 7:
				sortByCostInArrayList(projectList);
				break;
			case 8:
				findProjectsWithMaxTeamSize(projectList);
				break;
			default:
				break;
			}
		}

	}

}
