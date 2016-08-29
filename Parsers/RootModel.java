import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String code_of_conduct;
	public String state;
	public String location_name;
	public String schedule_published_on;
	public int id;
	public String description;
	public String logo;
	public String type;
	public String organizer_name;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String privacy;
	public String name;
	public String email;
	public String background_image;
	public String organizer_description;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String start_time;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String timezone, String code_of_conduct, String state, String location_name, String schedule_published_on, int id, String description, String logo, String type, String organizer_name, CreatorModel creator, CopyrightModel copyright, VersionModel version, String privacy, String name, String email, String background_image, String organizer_description, String topic, ArrayList<Social_linksModel> social_links, String end_time, String start_time, Call_for_papersModel call_for_papers) {

		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.description = description;
		this.logo = logo;
		this.type = type;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this._copyright = copyright;
		this._version = version;
		this.privacy = privacy;
		this.name = name;
		this.email = email;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.social_links = social_links;
		this.end_time = end_time;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;

	}

}