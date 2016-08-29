import java.util.ArrayList;

class RootModel {

	public String type;
	public String end_time;
	public String organizer_description;
	public String code_of_conduct;
	public String email;
	public String logo;
	public CreatorModel _creator;
	public String organizer_name;
	public String description;
	public CopyrightModel _copyright;
	public String state;
	public String privacy;
	public int id;
	public String name;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String background_image;
	public String start_time;
	public VersionModel _version;
	public String schedule_published_on;
	public String timezone;

	public RootModel(String type, String end_time, String organizer_description, String code_of_conduct, String email, String logo, CreatorModel creator, String organizer_name, String description, CopyrightModel copyright, String state, String privacy, int id, String name, String topic, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String location_name, String background_image, String start_time, VersionModel version, String schedule_published_on, String timezone) {

		this.type = type;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.logo = logo;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.description = description;
		this._copyright = copyright;
		this.state = state;
		this.privacy = privacy;
		this.id = id;
		this.name = name;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.location_name = location_name;
		this.background_image = background_image;
		this.start_time = start_time;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;

	}

}