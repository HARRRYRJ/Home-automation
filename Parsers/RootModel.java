import java.util.ArrayList;

class RootModel {

	public String state;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String organizer_description;
	public String description;
	public String schedule_published_on;
	public String end_time;
	public String topic;
	public String logo;
	public String name;
	public String email;
	public CreatorModel _creator;
	public String timezone;
	public String background_image;
	public String start_time;
	public String code_of_conduct;
	public String location_name;
	public String privacy;
	public String organizer_name;
	public int id;

	public RootModel(String state, VersionModel version, CopyrightModel copyright, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String type, String organizer_description, String description, String schedule_published_on, String end_time, String topic, String logo, String name, String email, CreatorModel creator, String timezone, String background_image, String start_time, String code_of_conduct, String location_name, String privacy, String organizer_name, int id) {

		this.state = state;
		this._version = version;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.type = type;
		this.organizer_description = organizer_description;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.topic = topic;
		this.logo = logo;
		this.name = name;
		this.email = email;
		this._creator = creator;
		this.timezone = timezone;
		this.background_image = background_image;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.id = id;

	}

}