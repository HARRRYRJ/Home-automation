import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String description;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public VersionModel _version;
	public String start_time;
	public String type;
	public String background_image;
	public String code_of_conduct;
	public String logo;
	public String timezone;
	public CreatorModel _creator;
	public String state;
	public String name;
	public String topic;
	public String privacy;
	public String organizer_name;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String location_name;

	public RootModel(String end_time, String schedule_published_on, CopyrightModel copyright, String description, String organizer_description, ArrayList<Social_linksModel> social_links, int id, VersionModel version, String start_time, String type, String background_image, String code_of_conduct, String logo, String timezone, CreatorModel creator, String state, String name, String topic, String privacy, String organizer_name, String email, Call_for_papersModel call_for_papers, String location_name) {

		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.description = description;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.id = id;
		this._version = version;
		this.start_time = start_time;
		this.type = type;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.timezone = timezone;
		this._creator = creator;
		this.state = state;
		this.name = name;
		this.topic = topic;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;

	}

}