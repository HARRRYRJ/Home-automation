import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String state;
	public CopyrightModel _copyright;
	public String logo;
	public String end_time;
	public CreatorModel _creator;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String organizer_description;
	public String email;
	public String schedule_published_on;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String topic;
	public String code_of_conduct;
	public String description;
	public String type;
	public VersionModel _version;
	public String organizer_name;
	public String name;
	public int id;

	public RootModel(String start_time, String state, CopyrightModel copyright, String logo, String end_time, CreatorModel creator, String timezone, Call_for_papersModel call_for_papers, String location_name, String organizer_description, String email, String schedule_published_on, String privacy, ArrayList<Social_linksModel> social_links, String background_image, String topic, String code_of_conduct, String description, String type, VersionModel version, String organizer_name, String name, int id) {

		this.start_time = start_time;
		this.state = state;
		this._copyright = copyright;
		this.logo = logo;
		this.end_time = end_time;
		this._creator = creator;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.social_links = social_links;
		this.background_image = background_image;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.type = type;
		this._version = version;
		this.organizer_name = organizer_name;
		this.name = name;
		this.id = id;

	}

}