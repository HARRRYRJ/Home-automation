import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String code_of_conduct;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String description;
	public String email;
	public String logo;
	public VersionModel _version;
	public String start_time;
	public String topic;
	public String state;
	public String organizer_name;
	public String end_time;
	public CopyrightModel _copyright;
	public String privacy;
	public String organizer_description;
	public CreatorModel _creator;
	public String location_name;
	public String schedule_published_on;
	public String timezone;
	public String name;

	public RootModel(String background_image, String code_of_conduct, String type, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, int id, String description, String email, String logo, VersionModel version, String start_time, String topic, String state, String organizer_name, String end_time, CopyrightModel copyright, String privacy, String organizer_description, CreatorModel creator, String location_name, String schedule_published_on, String timezone, String name) {

		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.description = description;
		this.email = email;
		this.logo = logo;
		this._version = version;
		this.start_time = start_time;
		this.topic = topic;
		this.state = state;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this._copyright = copyright;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.name = name;

	}

}