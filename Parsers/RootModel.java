import java.util.ArrayList;

class RootModel {

	public String email;
	public CopyrightModel _copyright;
	public String logo;
	public String background_image;
	public CreatorModel _creator;
	public String end_time;
	public String code_of_conduct;
	public String name;
	public String start_time;
	public String type;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public VersionModel _version;
	public String schedule_published_on;
	public String organizer_description;
	public String description;
	public int id;
	public String privacy;
	public String location_name;

	public RootModel(String email, CopyrightModel copyright, String logo, String background_image, CreatorModel creator, String end_time, String code_of_conduct, String name, String start_time, String type, String timezone, Call_for_papersModel call_for_papers, String organizer_name, String topic, ArrayList<Social_linksModel> social_links, String state, VersionModel version, String schedule_published_on, String organizer_description, String description, int id, String privacy, String location_name) {

		this.email = email;
		this._copyright = copyright;
		this.logo = logo;
		this.background_image = background_image;
		this._creator = creator;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.start_time = start_time;
		this.type = type;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.social_links = social_links;
		this.state = state;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.description = description;
		this.id = id;
		this.privacy = privacy;
		this.location_name = location_name;

	}

}