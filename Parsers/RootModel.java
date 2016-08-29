import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String logo;
	public String type;
	public CreatorModel _creator;
	public String end_time;
	public String organizer_description;
	public String topic;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String email;
	public VersionModel _version;
	public String privacy;
	public String state;
	public String organizer_name;
	public String start_time;
	public String code_of_conduct;
	public String timezone;
	public int id;
	public String description;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String location_name, String logo, String type, CreatorModel creator, String end_time, String organizer_description, String topic, String background_image, ArrayList<Social_linksModel> social_links, String name, String email, VersionModel version, String privacy, String state, String organizer_name, String start_time, String code_of_conduct, String timezone, int id, String description, CopyrightModel copyright, String schedule_published_on, Call_for_papersModel call_for_papers) {

		this.location_name = location_name;
		this.logo = logo;
		this.type = type;
		this._creator = creator;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.background_image = background_image;
		this.social_links = social_links;
		this.name = name;
		this.email = email;
		this._version = version;
		this.privacy = privacy;
		this.state = state;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.id = id;
		this.description = description;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;

	}

}