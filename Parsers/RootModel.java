import java.util.ArrayList;

class RootModel {

	public String email;
	public String background_image;
	public String description;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String logo;
	public String type;
	public String organizer_description;
	public int id;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String location_name;
	public String privacy;
	public String topic;
	public String state;
	public String timezone;
	public String start_time;
	public String name;
	public String end_time;
	public String organizer_name;

	public RootModel(String email, String background_image, String description, CopyrightModel copyright, VersionModel version, String logo, String type, String organizer_description, int id, String code_of_conduct, Call_for_papersModel call_for_papers, CreatorModel creator, ArrayList<Social_linksModel> social_links, String schedule_published_on, String location_name, String privacy, String topic, String state, String timezone, String start_time, String name, String end_time, String organizer_name) {

		this.email = email;
		this.background_image = background_image;
		this.description = description;
		this._copyright = copyright;
		this._version = version;
		this.logo = logo;
		this.type = type;
		this.organizer_description = organizer_description;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.privacy = privacy;
		this.topic = topic;
		this.state = state;
		this.timezone = timezone;
		this.start_time = start_time;
		this.name = name;
		this.end_time = end_time;
		this.organizer_name = organizer_name;

	}

}