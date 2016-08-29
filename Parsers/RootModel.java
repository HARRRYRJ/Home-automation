import java.util.ArrayList;

class RootModel {

	public String background_image;
	public int id;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public String state;
	public String topic;
	public CopyrightModel _copyright;
	public String start_time;
	public CreatorModel _creator;
	public String name;
	public String type;
	public String email;
	public String description;
	public String code_of_conduct;
	public String timezone;
	public String end_time;
	public String organizer_description;
	public String logo;
	public String location_name;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;

	public RootModel(String background_image, int id, String privacy, Call_for_papersModel call_for_papers, String schedule_published_on, String state, String topic, CopyrightModel copyright, String start_time, CreatorModel creator, String name, String type, String email, String description, String code_of_conduct, String timezone, String end_time, String organizer_description, String logo, String location_name, VersionModel version, ArrayList<Social_linksModel> social_links, String organizer_name) {

		this.background_image = background_image;
		this.id = id;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.topic = topic;
		this._copyright = copyright;
		this.start_time = start_time;
		this._creator = creator;
		this.name = name;
		this.type = type;
		this.email = email;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this.location_name = location_name;
		this._version = version;
		this.social_links = social_links;
		this.organizer_name = organizer_name;

	}

}