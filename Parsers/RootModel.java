import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public String logo;
	public String start_time;
	public CreatorModel _creator;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String background_image;
	public String email;
	public String state;
	public VersionModel _version;
	public String organizer_name;
	public String privacy;
	public CopyrightModel _copyright;
	public String topic;
	public String end_time;
	public String name;
	public String timezone;
	public String description;
	public String location_name;

	public RootModel(String organizer_description, String type, Call_for_papersModel call_for_papers, String schedule_published_on, String logo, String start_time, CreatorModel creator, String code_of_conduct, ArrayList<Social_linksModel> social_links, int id, String background_image, String email, String state, VersionModel version, String organizer_name, String privacy, CopyrightModel copyright, String topic, String end_time, String name, String timezone, String description, String location_name) {

		this.organizer_description = organizer_description;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.start_time = start_time;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.id = id;
		this.background_image = background_image;
		this.email = email;
		this.state = state;
		this._version = version;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this._copyright = copyright;
		this.topic = topic;
		this.end_time = end_time;
		this.name = name;
		this.timezone = timezone;
		this.description = description;
		this.location_name = location_name;

	}

}