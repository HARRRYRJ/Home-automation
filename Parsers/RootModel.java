import java.util.ArrayList;

class RootModel {

	public String logo;
	public int id;
	public String location_name;
	public String name;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public CreatorModel _creator;
	public String topic;
	public VersionModel _version;
	public String type;
	public String privacy;
	public CopyrightModel _copyright;
	public String timezone;
	public String schedule_published_on;
	public String code_of_conduct;
	public String end_time;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String organizer_name;
	public String organizer_description;
	public String background_image;

	public RootModel(String logo, int id, String location_name, String name, String description, Call_for_papersModel call_for_papers, String state, CreatorModel creator, String topic, VersionModel version, String type, String privacy, CopyrightModel copyright, String timezone, String schedule_published_on, String code_of_conduct, String end_time, String start_time, ArrayList<Social_linksModel> social_links, String email, String organizer_name, String organizer_description, String background_image) {

		this.logo = logo;
		this.id = id;
		this.location_name = location_name;
		this.name = name;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this._creator = creator;
		this.topic = topic;
		this._version = version;
		this.type = type;
		this.privacy = privacy;
		this._copyright = copyright;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.start_time = start_time;
		this.social_links = social_links;
		this.email = email;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.background_image = background_image;

	}

}