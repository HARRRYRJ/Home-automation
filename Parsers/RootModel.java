import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String organizer_description;
	public String end_time;
	public String location_name;
	public String email;
	public String start_time;
	public String schedule_published_on;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String topic;
	public String state;
	public String logo;
	public String name;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String type;
	public String description;
	public String timezone;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String organizer_name;

	public RootModel(String background_image, String organizer_description, String end_time, String location_name, String email, String start_time, String schedule_published_on, String code_of_conduct, CreatorModel creator, String topic, String state, String logo, String name, int id, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String type, String description, String timezone, VersionModel version, Call_for_papersModel call_for_papers, String privacy, String organizer_name) {

		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.location_name = location_name;
		this.email = email;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.topic = topic;
		this.state = state;
		this.logo = logo;
		this.name = name;
		this.id = id;
		this.social_links = social_links;
		this._copyright = copyright;
		this.type = type;
		this.description = description;
		this.timezone = timezone;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.organizer_name = organizer_name;

	}

}