import java.time.LocalDate;

class Player implements Comparable<Player>{
    private String name;
    private LocalDate dob ;
    private String skill;
    private int matches;
    private int runs;
    private int wickets;
    private String nationality;
    private double runrate;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getSkill() {
        return skill;
    }
    public void setSkill(String skill) {
        this.skill = skill;
    }

    public int getMatches() {
        return matches;
    }
    public void setMatches(int matches) {
        this.matches = matches;
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

    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    
    public double getRunrate() {
        return runrate;
    }
    public void setRunrate(double runrate) {
        this.runrate = runrate;
    }

    public Player(){

    }
    public Player(String name, LocalDate dob, String skill, int matches, int runs, int wickets, String nationality, double runrate) {
        this.name = name;
        this.dob = dob;
        this.skill = skill;
        this.matches = matches;
        this.runs = runs;
        this.wickets = wickets;
        this.nationality = nationality;
        this.runrate = runrate;
    }
    
    static Player createPlayer(String detail){

        String[] details = detail.split(",");
		String name = details[0];
        LocalDate dob = LocalDate.parse(details[1]);
        String skill = details[2];
        Integer matches = Integer.parseInt(details[3]);
        Integer runs = Integer.parseInt(details[4]);
        Integer wickets = Integer.parseInt(details[5]);
        String nationality = details[6];
        Double runrate = Double.parseDouble(details[7]);
		
		Player player = new Player(name, dob, skill, matches, runs, wickets, nationality, runrate);
		
		return player;
    }

    public int compareTo(Player p) {
		return Integer.compare(this.matches, p.matches);
	}

  
}