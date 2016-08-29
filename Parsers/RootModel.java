import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String background_image;
	public String state;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public int id;
	public String name;
	public String logo;
	public String organizer_name;
	public String end_time;
	public String email;
	public CreatorModel _creator;
	public String start_time;
	public String schedule_published_on;
	public String timezone;
	public String type;
	public String organizer_description;
	public String topic;
	public String description;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String location_name, String background_image, String state, CopyrightModel copyright, VersionModel version, int id, String name, String logo, String organizer_name, String end_time, String email, CreatorModel creator, String start_time, String schedule_published_on, String timezone, String type, String organizer_description, String topic, String description, String privacy, ArrayList<Social_linksModel> social_links, String code_of_conduct, Call_for_papersModel call_for_papers) {

		this.location_name = location_name;
		this.background_image = background_image;
		this.state = state;
		this._copyright = copyright;
		this._version = version;
		this.id = id;
		this.name = name;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.email = email;
		this._creator = creator;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.type = type;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.description = description;
		this.privacy = privacy;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;

	}

}