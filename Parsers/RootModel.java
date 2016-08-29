import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String logo;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String organizer_description;
	public String end_time;
	public int id;
	public String topic;
	public VersionModel _version;
	public String organizer_name;
	public CreatorModel _creator;
	public String timezone;
	public String type;
	public String background_image;
	public String description;
	public String location_name;
	public String state;
	public String schedule_published_on;
	public String code_of_conduct;
	public String name;

	public RootModel(String privacy, String logo, String start_time, Call_for_papersModel call_for_papers, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String email, String organizer_description, String end_time, int id, String topic, VersionModel version, String organizer_name, CreatorModel creator, String timezone, String type, String background_image, String description, String location_name, String state, String schedule_published_on, String code_of_conduct, String name) {

		this.privacy = privacy;
		this.logo = logo;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.social_links = social_links;
		this.email = email;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.id = id;
		this.topic = topic;
		this._version = version;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.timezone = timezone;
		this.type = type;
		this.background_image = background_image;
		this.description = description;
		this.location_name = location_name;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.name = name;

	}

}