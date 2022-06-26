package curs9;

public class Qualification extends Teacher{
	
	public Qualification(String course, int experienceYears, String schedule) {
		
		this.course = course;
		this.experienceYears = experienceYears;
		this.schedule = schedule;
	}
	
	public void verify(Qualification qualification) {
		
		if(this.experienceYears > 3 && this.course.equals("Java") && this.schedule.equals("Afternoon")) {
			System.out.println("You qualify to teach at this school!");
		} else {
			System.out.println("You do not qualify!");
		}

	}

}
