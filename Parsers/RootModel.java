import java.util.ArrayList;

class RootModel {

	public String name;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String type;
	public String privacy;
	public String organizer_description;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String organizer_name;
	public String end_time;
	public String description;
	public String logo;
	public String email;
	public String start_time;
	public String code_of_conduct;
	public VersionModel _version;
	public String background_image;
	public String location_name;
	public String timezone;
	public int id;

	public RootModel(String name, String topic, ArrayList<Social_linksModel> social_links, CreatorModel creator, String schedule_published_on, String type, String privacy, String organizer_description, CopyrightModel copyright, Call_for_papersModel call_for_papers, String state, String organizer_name, String end_time, String description, String logo, String email, String start_time, String code_of_conduct, VersionModel version, String background_image, String location_name, String timezone, int id) {

		this.name = name;
		this.topic = topic;
		this.social_links = social_links;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.description = description;
		this.logo = logo;
		this.email = email;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.background_image = background_image;
		this.location_name = location_name;
		this.timezone = timezone;
		this.id = id;

	}

}