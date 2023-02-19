import java.time.LocalDate;

class Player{
    private String name , skill , nationality;
    private int mathces , runs , wickets;
    private double runrate;
    LocalDate dob ;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSkill() {
        return skill;
    }
    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getMathces() {
        return mathces;
    }
    public void setMathces(int mathces) {
        this.mathces = mathces;
    }

    public int getRuns() {
        return runs;
    }
    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getWickets() {
        return wickets;
    }
    public void setWickets(int wickets) {
        this.wickets = wickets;
    }

    public double getRunrate() {
        return runrate;
    }
    public void setRunrate(double runrate) {
        this.runrate = runrate;
    }

    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Player(){

    }

    public Player(String name, LocalDate dob, String skill,  int mathces, int runs, int wickets,String nationality, double runrate) {
        this.name = name;
        this.skill = skill;
        this.nationality = nationality;
        this.mathces = mathces;
        this.runs = runs;
        this.wickets = wickets;
        this.runrate = runrate;
        this.dob = dob;
    }

    public static Player createPlayer(String detail) {
		
		String[] details = detail.split(",");
		
		String name = details[0];
        LocalDate dateOfBirth = LocalDate.parse(details[1]);
        String skill = details[2];
        Integer numberOfMatches = Integer.parseInt(details[3]);
        Integer runs = Integer.parseInt(details[4]);
        Integer wickets = Integer.parseInt(details[5]);
        String nationality = details[6];
        Double powerRating = Double.parseDouble(details[7]);
		
		Player player = new Player(name, dateOfBirth, skill, numberOfMatches, runs, wickets, nationality, powerRating);
		
		return player;
	}
    // @Override
    // public String toString() {
	// 	return "%-15s%-15s%-10s%-15s%-10s%-10s%-15s%-10s\n", "Name", "Date of birth", "Skill", "No of matches", "Runs", "Wickets", "Nationality", "Rating";

	// }
}