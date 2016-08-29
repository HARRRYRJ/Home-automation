import java.util.ArrayList;

class RootModel {

	public String name;
	public String description;
	public String end_time;
	public String organizer_description;
	public String type;
	public String logo;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String email;
	public String timezone;
	public String topic;
	public String start_time;
	public String privacy;
	public CreatorModel _creator;
	public String organizer_name;
	public String schedule_published_on;
	public String location_name;

	public RootModel(String name, String description, String end_time, String organizer_description, String type, String logo, String state, ArrayList<Social_linksModel> social_links, String background_image, String code_of_conduct, CopyrightModel copyright, VersionModel version, Call_for_papersModel call_for_papers, int id, String email, String timezone, String topic, String start_time, String privacy, CreatorModel creator, String organizer_name, String schedule_published_on, String location_name) {

		this.name = name;
		this.description = description;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.type = type;
		this.logo = logo;
		this.state = state;
		this.social_links = social_links;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.email = email;
		this.timezone = timezone;
		this.topic = topic;
		this.start_time = start_time;
		this.privacy = privacy;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;

	}

}