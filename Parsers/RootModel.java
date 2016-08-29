import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String code_of_conduct;
	public String description;
	public CreatorModel _creator;
	public VersionModel _version;
	public String background_image;
	public CopyrightModel _copyright;
	public String logo;
	public String name;
	public String state;
	public String email;
	public String privacy;
	public String type;
	public String organizer_description;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String organizer_name;
	public String location_name;
	public int id;

	public RootModel(String start_time, String code_of_conduct, String description, CreatorModel creator, VersionModel version, String background_image, CopyrightModel copyright, String logo, String name, String state, String email, String privacy, String type, String organizer_description, String end_time, ArrayList<Social_linksModel> social_links, String schedule_published_on, String topic, Call_for_papersModel call_for_papers, String timezone, String organizer_name, String location_name, int id) {

		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this._creator = creator;
		this._version = version;
		this.background_image = background_image;
		this._copyright = copyright;
		this.logo = logo;
		this.name = name;
		this.state = state;
		this.email = email;
		this.privacy = privacy;
		this.type = type;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.id = id;

	}

}