import java.util.ArrayList;

class RootModel {

	public String background_image;
	public CreatorModel _creator;
	public String organizer_description;
	public String timezone;
	public String organizer_name;
	public VersionModel _version;
	public String location_name;
	public String name;
	public String code_of_conduct;
	public String start_time;
	public String topic;
	public String description;
	public String privacy;
	public String logo;
	public String schedule_published_on;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String end_time;
	public String email;
	public String type;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String background_image, CreatorModel creator, String organizer_description, String timezone, String organizer_name, VersionModel version, String location_name, String name, String code_of_conduct, String start_time, String topic, String description, String privacy, String logo, String schedule_published_on, String state, ArrayList<Social_linksModel> social_links, int id, String end_time, String email, String type, CopyrightModel copyright, Call_for_papersModel call_for_papers) {

		this.background_image = background_image;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this._version = version;
		this.location_name = location_name;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.topic = topic;
		this.description = description;
		this.privacy = privacy;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.social_links = social_links;
		this.id = id;
		this.end_time = end_time;
		this.email = email;
		this.type = type;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;

	}

}