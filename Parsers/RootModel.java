import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String location_name;
	public String end_time;
	public CopyrightModel _copyright;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String topic;
	public String timezone;
	public String background_image;
	public String logo;
	public VersionModel _version;
	public String code_of_conduct;
	public String privacy;
	public String description;
	public CreatorModel _creator;
	public String name;
	public String organizer_name;
	public String email;
	public int id;

	public RootModel(String schedule_published_on, String location_name, String end_time, CopyrightModel copyright, String type, ArrayList<Social_linksModel> social_links, String state, String start_time, Call_for_papersModel call_for_papers, String organizer_description, String topic, String timezone, String background_image, String logo, VersionModel version, String code_of_conduct, String privacy, String description, CreatorModel creator, String name, String organizer_name, String email, int id) {

		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.end_time = end_time;
		this._copyright = copyright;
		this.type = type;
		this.social_links = social_links;
		this.state = state;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.timezone = timezone;
		this.background_image = background_image;
		this.logo = logo;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.description = description;
		this._creator = creator;
		this.name = name;
		this.organizer_name = organizer_name;
		this.email = email;
		this.id = id;

	}

}