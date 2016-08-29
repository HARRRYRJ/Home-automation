import java.util.ArrayList;

class RootModel {

	public String end_time;
	public CopyrightModel _copyright;
	public String state;
	public CreatorModel _creator;
	public String code_of_conduct;
	public String organizer_name;
	public String schedule_published_on;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String timezone;
	public String topic;
	public String start_time;
	public String background_image;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String name;
	public String privacy;
	public String organizer_description;
	public String description;
	public String email;
	public String location_name;

	public RootModel(String end_time, CopyrightModel copyright, String state, CreatorModel creator, String code_of_conduct, String organizer_name, String schedule_published_on, VersionModel version, Call_for_papersModel call_for_papers, int id, String timezone, String topic, String start_time, String background_image, String logo, ArrayList<Social_linksModel> social_links, String type, String name, String privacy, String organizer_description, String description, String email, String location_name) {

		this.end_time = end_time;
		this._copyright = copyright;
		this.state = state;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.timezone = timezone;
		this.topic = topic;
		this.start_time = start_time;
		this.background_image = background_image;
		this.logo = logo;
		this.social_links = social_links;
		this.type = type;
		this.name = name;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.description = description;
		this.email = email;
		this.location_name = location_name;

	}

}