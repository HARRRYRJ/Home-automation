import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String type;
	public String state;
	public String code_of_conduct;
	public int id;
	public String organizer_name;
	public String description;
	public CreatorModel _creator;
	public String privacy;
	public String timezone;
	public String start_time;
	public String logo;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String end_time;
	public String location_name;
	public String name;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String email;
	public String background_image;

	public RootModel(String schedule_published_on, String type, String state, String code_of_conduct, int id, String organizer_name, String description, CreatorModel creator, String privacy, String timezone, String start_time, String logo, VersionModel version, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String end_time, String location_name, String name, String topic, Call_for_papersModel call_for_papers, String organizer_description, String email, String background_image) {

		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.organizer_name = organizer_name;
		this.description = description;
		this._creator = creator;
		this.privacy = privacy;
		this.timezone = timezone;
		this.start_time = start_time;
		this.logo = logo;
		this._version = version;
		this.social_links = social_links;
		this._copyright = copyright;
		this.end_time = end_time;
		this.location_name = location_name;
		this.name = name;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.email = email;
		this.background_image = background_image;

	}

}