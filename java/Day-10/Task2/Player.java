import java.time.LocalDate;

class Player{
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
    public void add(Player pList) {
    }
    
}