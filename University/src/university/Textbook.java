package university;

public class Textbook {
	private String title;
	private String edition;
	
	Textbook(String title, String edition){
		this.title=title;
		this.edition=edition;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String toString() {
		return getTitle()+"\nEdition :"+getEdition();
	}
}
