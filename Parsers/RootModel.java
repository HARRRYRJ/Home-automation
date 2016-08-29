import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String schedule_published_on;
	public String state;
	public String topic;
	public CreatorModel _creator;
	public String email;
	public String timezone;
	public String organizer_description;
	public String organizer_name;
	public VersionModel _version;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String description;
	public String end_time;
	public int id;
	public String location_name;
	public String type;
	public String privacy;
	public String background_image;
	public CopyrightModel _copyright;
	public String logo;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String code_of_conduct, String schedule_published_on, String state, String topic, CreatorModel creator, String email, String timezone, String organizer_description, String organizer_name, VersionModel version, String start_time, ArrayList<Social_linksModel> social_links, String name, String description, String end_time, int id, String location_name, String type, String privacy, String background_image, CopyrightModel copyright, String logo, Call_for_papersModel call_for_papers) {

		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.topic = topic;
		this._creator = creator;
		this.email = email;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this._version = version;
		this.start_time = start_time;
		this.social_links = social_links;
		this.name = name;
		this.description = description;
		this.end_time = end_time;
		this.id = id;
		this.location_name = location_name;
		this.type = type;
		this.privacy = privacy;
		this.background_image = background_image;
		this._copyright = copyright;
		this.logo = logo;
		this._call_for_papers = call_for_papers;

	}

}