package question2;

import java.util.Objects;
import java.util.Scanner;

public class Project {
	private int id;
	private String title;
	private int teamSize;
	private double projectCost;
	private String technology;

	public Project() {
		// TODO Auto-generated constructor stub
	}

	public Project(int id, String title, int teamSize, double projectCost, String technology) {
		this.id = id;
		this.title = title;
		this.teamSize = teamSize;
		this.projectCost = projectCost;
		this.technology = technology;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public double getProjectCost() {
		return projectCost;
	}

	public void setProjectCost(double projectCost) {
		this.projectCost = projectCost;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	@Override
	public String toString() {
		return String.format("\tid=%s, title=%s, teamSize=%s, projectCost=%s, technology=%s", id, title, teamSize,
				projectCost, technology);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Project other = (Project) obj;
		return id == other.id;
	}

	public void acceptRecord(Scanner sc) {
		System.out.println("Enter project id : ");
		this.id = sc.nextInt();
		System.out.println("Enter project title : ");
		this.title = sc.next();
		System.out.println("Enter team size : ");
		this.teamSize = sc.nextInt();
		System.out.println("Enter project cost : ");
		this.projectCost = sc.nextDouble();
		System.out.println("Enter technology : ");
		this.technology = sc.next();
	}

}
