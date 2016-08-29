import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String name;
	public String code_of_conduct;
	public String background_image;
	public String logo;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String schedule_published_on;
	public String type;
	public String organizer_description;
	public String location_name;
	public String privacy;
	public String topic;
	public String state;
	public String description;
	public VersionModel _version;
	public String end_time;
	public CreatorModel _creator;
	public String email;
	public String timezone;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String start_time, String name, String code_of_conduct, String background_image, String logo, String organizer_name, ArrayList<Social_linksModel> social_links, int id, String schedule_published_on, String type, String organizer_description, String location_name, String privacy, String topic, String state, String description, VersionModel version, String end_time, CreatorModel creator, String email, String timezone, CopyrightModel copyright, Call_for_papersModel call_for_papers) {

		this.start_time = start_time;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.privacy = privacy;
		this.topic = topic;
		this.state = state;
		this.description = description;
		this._version = version;
		this.end_time = end_time;
		this._creator = creator;
		this.email = email;
		this.timezone = timezone;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;

	}

}