import java.util.ArrayList;

class RootModel {

	public String type;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String end_time;
	public int id;
	public String privacy;
	public VersionModel _version;
	public String state;
	public String organizer_description;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String topic;
	public String logo;
	public String email;
	public String name;
	public String description;
	public String timezone;
	public String background_image;
	public String code_of_conduct;
	public String location_name;

	public RootModel(String type, String start_time, Call_for_papersModel call_for_papers, CreatorModel creator, String end_time, int id, String privacy, VersionModel version, String state, String organizer_description, String schedule_published_on, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String organizer_name, String topic, String logo, String email, String name, String description, String timezone, String background_image, String code_of_conduct, String location_name) {

		this.type = type;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.end_time = end_time;
		this.id = id;
		this.privacy = privacy;
		this._version = version;
		this.state = state;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.logo = logo;
		this.email = email;
		this.name = name;
		this.description = description;
		this.timezone = timezone;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;

	}

}