import java.util.ArrayList;

class RootModel {

	public String logo;
	public String code_of_conduct;
	public String type;
	public String organizer_description;
	public String email;
	public String timezone;
	public String end_time;
	public VersionModel _version;
	public String start_time;
	public String topic;
	public String schedule_published_on;
	public int id;
	public CreatorModel _creator;
	public String location_name;
	public String description;
	public String background_image;
	public String state;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String privacy;
	public CopyrightModel _copyright;

	public RootModel(String logo, String code_of_conduct, String type, String organizer_description, String email, String timezone, String end_time, VersionModel version, String start_time, String topic, String schedule_published_on, int id, CreatorModel creator, String location_name, String description, String background_image, String state, String name, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String organizer_name, String privacy, CopyrightModel copyright) {

		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.organizer_description = organizer_description;
		this.email = email;
		this.timezone = timezone;
		this.end_time = end_time;
		this._version = version;
		this.start_time = start_time;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this._creator = creator;
		this.location_name = location_name;
		this.description = description;
		this.background_image = background_image;
		this.state = state;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this._copyright = copyright;

	}

}