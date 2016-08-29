import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public VersionModel _version;
	public String schedule_published_on;
	public String state;
	public String logo;
	public String privacy;
	public String name;
	public int id;
	public String topic;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String description;
	public String end_time;
	public String code_of_conduct;
	public String organizer_description;
	public String timezone;
	public String email;
	public CreatorModel _creator;
	public String start_time;
	public String location_name;

	public RootModel(String organizer_name, VersionModel version, String schedule_published_on, String state, String logo, String privacy, String name, int id, String topic, String type, ArrayList<Social_linksModel> social_links, String background_image, Call_for_papersModel call_for_papers, CopyrightModel copyright, String description, String end_time, String code_of_conduct, String organizer_description, String timezone, String email, CreatorModel creator, String start_time, String location_name) {

		this.organizer_name = organizer_name;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.logo = logo;
		this.privacy = privacy;
		this.name = name;
		this.id = id;
		this.topic = topic;
		this.type = type;
		this.social_links = social_links;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.description = description;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.email = email;
		this._creator = creator;
		this.start_time = start_time;
		this.location_name = location_name;

	}

}