import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String location_name;
	public int id;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public String description;
	public String type;
	public String state;
	public String organizer_description;
	public String schedule_published_on;
	public VersionModel _version;
	public String timezone;
	public CopyrightModel _copyright;
	public String name;
	public String topic;
	public String email;
	public String background_image;
	public String privacy;
	public String logo;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String organizer_name, String code_of_conduct, CreatorModel creator, String location_name, int id, String end_time, ArrayList<Social_linksModel> social_links, String start_time, String description, String type, String state, String organizer_description, String schedule_published_on, VersionModel version, String timezone, CopyrightModel copyright, String name, String topic, String email, String background_image, String privacy, String logo, Call_for_papersModel call_for_papers) {

		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.location_name = location_name;
		this.id = id;
		this.end_time = end_time;
		this.social_links = social_links;
		this.start_time = start_time;
		this.description = description;
		this.type = type;
		this.state = state;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.timezone = timezone;
		this._copyright = copyright;
		this.name = name;
		this.topic = topic;
		this.email = email;
		this.background_image = background_image;
		this.privacy = privacy;
		this.logo = logo;
		this._call_for_papers = call_for_papers;

	}

}