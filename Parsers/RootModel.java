import java.util.ArrayList;

class RootModel {

	public String type;
	public String location_name;
	public VersionModel _version;
	public String start_time;
	public String state;
	public String topic;
	public String code_of_conduct;
	public String logo;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public String email;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String timezone;
	public CreatorModel _creator;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String privacy;
	public int id;
	public String organizer_description;
	public String name;

	public RootModel(String type, String location_name, VersionModel version, String start_time, String state, String topic, String code_of_conduct, String logo, String end_time, Call_for_papersModel call_for_papers, String description, String email, String schedule_published_on, CopyrightModel copyright, String timezone, CreatorModel creator, String background_image, ArrayList<Social_linksModel> social_links, String organizer_name, String privacy, int id, String organizer_description, String name) {

		this.type = type;
		this.location_name = location_name;
		this._version = version;
		this.start_time = start_time;
		this.state = state;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.timezone = timezone;
		this._creator = creator;
		this.background_image = background_image;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.id = id;
		this.organizer_description = organizer_description;
		this.name = name;

	}

}