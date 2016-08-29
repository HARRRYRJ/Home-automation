import java.util.ArrayList;

class RootModel {

	public String email;
	public String schedule_published_on;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String topic;
	public String code_of_conduct;
	public String timezone;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String organizer_name;
	public CreatorModel _creator;
	public String state;
	public String organizer_description;
	public String logo;
	public int id;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String type;
	public String start_time;
	public String name;
	public String background_image;

	public RootModel(String email, String schedule_published_on, String location_name, Call_for_papersModel call_for_papers, String privacy, String topic, String code_of_conduct, String timezone, String end_time, ArrayList<Social_linksModel> social_links, String description, String organizer_name, CreatorModel creator, String state, String organizer_description, String logo, int id, VersionModel version, CopyrightModel copyright, String type, String start_time, String name, String background_image) {

		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.end_time = end_time;
		this.social_links = social_links;
		this.description = description;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.state = state;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this.id = id;
		this._version = version;
		this._copyright = copyright;
		this.type = type;
		this.start_time = start_time;
		this.name = name;
		this.background_image = background_image;

	}

}