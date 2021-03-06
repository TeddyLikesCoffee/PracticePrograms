package basketballTournament;

public class Teams {
	public static int MAX_PLAYERS_PER_TEAM=2;
	public static double MINIMUM_PLAYER_GPA=2.0;
	public int counter=0;
	private String name;
	private String email;
	private int numPlayers;
	private String [] playerNames;
	private double [] playerGPAs;
	
	public Teams() {
		playerNames = new String[MAX_PLAYERS_PER_TEAM];
		playerGPAs = new double[MAX_PLAYERS_PER_TEAM];
	}
	
	public void setName(String name) { this.name=name;}
	public void setEmail(String email) {this.email=email;}
	
	public boolean setAPlayer(String name, double gpa) {
		while(gpa>=MINIMUM_PLAYER_GPA & counter < MAX_PLAYERS_PER_TEAM) {
			this.playerNames[counter]=name;
			this.playerGPAs[counter++]=gpa;	
			//counter++;
			return true;
		}
		return false;
	}
	
	 public String toString() {
		 String teamInfo;
		 String playerInfo="\n";
		 teamInfo="Team Name: "+this.name+"\n"
				+"Email address: "+this.email+"\n";
		 for(int x=0 ; x < counter; x++) {
			 playerInfo+=playerNames[x]+" "+playerGPAs[x]+"\n";
		 }
		 return teamInfo+playerInfo;
	}
	
}
