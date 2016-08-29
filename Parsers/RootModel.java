import java.util.ArrayList;

class RootModel {

	public String topic;
	public String description;
	public String type;
	public String logo;
	public String start_time;
	public CopyrightModel _copyright;
	public String privacy;
	public String name;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String timezone;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String organizer_description;
	public String background_image;
	public String organizer_name;
	public String schedule_published_on;
	public String state;
	public VersionModel _version;
	public String email;
	public String location_name;

	public RootModel(String topic, String description, String type, String logo, String start_time, CopyrightModel copyright, String privacy, String name, CreatorModel creator, Call_for_papersModel call_for_papers, String end_time, String timezone, String code_of_conduct, ArrayList<Social_linksModel> social_links, int id, String organizer_description, String background_image, String organizer_name, String schedule_published_on, String state, VersionModel version, String email, String location_name) {

		this.topic = topic;
		this.description = description;
		this.type = type;
		this.logo = logo;
		this.start_time = start_time;
		this._copyright = copyright;
		this.privacy = privacy;
		this.name = name;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.id = id;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this._version = version;
		this.email = email;
		this.location_name = location_name;

	}

}