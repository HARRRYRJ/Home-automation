import java.util.ArrayList;

class RootModel {

	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String location_name;
	public String topic;
	public String background_image;
	public String name;
	public String logo;
	public String schedule_published_on;
	public String timezone;
	public String organizer_name;
	public String end_time;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String email;
	public CreatorModel _creator;
	public String start_time;
	public String privacy;
	public String organizer_description;
	public VersionModel _version;
	public String state;
	public CopyrightModel _copyright;

	public RootModel(String type, ArrayList<Social_linksModel> social_links, String code_of_conduct, String location_name, String topic, String background_image, String name, String logo, String schedule_published_on, String timezone, String organizer_name, String end_time, String description, Call_for_papersModel call_for_papers, int id, String email, CreatorModel creator, String start_time, String privacy, String organizer_description, VersionModel version, String state, CopyrightModel copyright) {

		this.type = type;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.topic = topic;
		this.background_image = background_image;
		this.name = name;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.email = email;
		this._creator = creator;
		this.start_time = start_time;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this._version = version;
		this.state = state;
		this._copyright = copyright;

	}

}