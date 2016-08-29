import java.util.ArrayList;

class RootModel {

	public String logo;
	public String end_time;
	public String organizer_description;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String email;
	public String name;
	public String timezone;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String background_image;
	public int id;
	public VersionModel _version;
	public String privacy;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String state;
	public String organizer_name;
	public String schedule_published_on;
	public String location_name;
	public String topic;

	public RootModel(String logo, String end_time, String organizer_description, CopyrightModel copyright, String code_of_conduct, String email, String name, String timezone, String start_time, Call_for_papersModel call_for_papers, CreatorModel creator, String background_image, int id, VersionModel version, String privacy, String description, ArrayList<Social_linksModel> social_links, String type, String state, String organizer_name, String schedule_published_on, String location_name, String topic) {

		this.logo = logo;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.name = name;
		this.timezone = timezone;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.background_image = background_image;
		this.id = id;
		this._version = version;
		this.privacy = privacy;
		this.description = description;
		this.social_links = social_links;
		this.type = type;
		this.state = state;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.topic = topic;

	}

}