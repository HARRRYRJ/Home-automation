import java.util.ArrayList;

class RootModel {

	public String description;
	public String type;
	public String background_image;
	public String timezone;
	public String end_time;
	public String organizer_name;
	public String organizer_description;
	public String state;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public String privacy;
	public String location_name;
	public String code_of_conduct;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String logo;
	public int id;
	public String topic;
	public String email;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String description, String type, String background_image, String timezone, String end_time, String organizer_name, String organizer_description, String state, String schedule_published_on, CreatorModel creator, String name, ArrayList<Social_linksModel> social_links, String start_time, String privacy, String location_name, String code_of_conduct, VersionModel version, CopyrightModel copyright, String logo, int id, String topic, String email, Call_for_papersModel call_for_papers) {

		this.description = description;
		this.type = type;
		this.background_image = background_image;
		this.timezone = timezone;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.name = name;
		this.social_links = social_links;
		this.start_time = start_time;
		this.privacy = privacy;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this._copyright = copyright;
		this.logo = logo;
		this.id = id;
		this.topic = topic;
		this.email = email;
		this._call_for_papers = call_for_papers;

	}

}