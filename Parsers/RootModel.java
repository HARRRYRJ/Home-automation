import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String start_time;
	public String state;
	public String email;
	public String organizer_name;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String timezone;
	public String location_name;
	public String end_time;
	public String organizer_description;
	public String name;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public int id;
	public VersionModel _version;
	public String code_of_conduct;
	public String privacy;
	public String schedule_published_on;
	public String logo;
	public String topic;

	public RootModel(String background_image, String start_time, String state, String email, String organizer_name, CreatorModel creator, CopyrightModel copyright, String timezone, String location_name, String end_time, String organizer_description, String name, String type, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String description, int id, VersionModel version, String code_of_conduct, String privacy, String schedule_published_on, String logo, String topic) {

		this.background_image = background_image;
		this.start_time = start_time;
		this.state = state;
		this.email = email;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this._copyright = copyright;
		this.timezone = timezone;
		this.location_name = location_name;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.name = name;
		this.type = type;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this.id = id;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.topic = topic;

	}

}