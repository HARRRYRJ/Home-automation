import java.util.ArrayList;

class RootModel {

	public String name;
	public String location_name;
	public CreatorModel _creator;
	public String type;
	public VersionModel _version;
	public int id;
	public String schedule_published_on;
	public String organizer_description;
	public String description;
	public CopyrightModel _copyright;
	public String state;
	public String topic;
	public String end_time;
	public String organizer_name;
	public String privacy;
	public String start_time;
	public String code_of_conduct;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String background_image;

	public RootModel(String name, String location_name, CreatorModel creator, String type, VersionModel version, int id, String schedule_published_on, String organizer_description, String description, CopyrightModel copyright, String state, String topic, String end_time, String organizer_name, String privacy, String start_time, String code_of_conduct, String logo, Call_for_papersModel call_for_papers, String timezone, ArrayList<Social_linksModel> social_links, String email, String background_image) {

		this.name = name;
		this.location_name = location_name;
		this._creator = creator;
		this.type = type;
		this._version = version;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.description = description;
		this._copyright = copyright;
		this.state = state;
		this.topic = topic;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.social_links = social_links;
		this.email = email;
		this.background_image = background_image;

	}

}