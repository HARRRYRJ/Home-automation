import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String logo;
	public String topic;
	public String email;
	public String start_time;
	public String organizer_description;
	public String name;
	public String state;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String description;
	public int id;
	public String location_name;
	public String organizer_name;
	public VersionModel _version;
	public String type;
	public String end_time;
	public String background_image;

	public RootModel(String schedule_published_on, String timezone, ArrayList<Social_linksModel> social_links, String privacy, String logo, String topic, String email, String start_time, String organizer_description, String name, String state, CopyrightModel copyright, CreatorModel creator, Call_for_papersModel call_for_papers, String code_of_conduct, String description, int id, String location_name, String organizer_name, VersionModel version, String type, String end_time, String background_image) {

		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.social_links = social_links;
		this.privacy = privacy;
		this.logo = logo;
		this.topic = topic;
		this.email = email;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.name = name;
		this.state = state;
		this._copyright = copyright;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.id = id;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this._version = version;
		this.type = type;
		this.end_time = end_time;
		this.background_image = background_image;

	}

}