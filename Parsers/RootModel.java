import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String type;
	public String organizer_description;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String end_time;
	public CreatorModel _creator;
	public String privacy;
	public String timezone;
	public String email;
	public String topic;
	public String background_image;
	public String name;
	public String location_name;
	public VersionModel _version;
	public String description;
	public String logo;
	public CopyrightModel _copyright;
	public String state;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public int id;

	public RootModel(String schedule_published_on, String type, String organizer_description, String code_of_conduct, Call_for_papersModel call_for_papers, String organizer_name, String end_time, CreatorModel creator, String privacy, String timezone, String email, String topic, String background_image, String name, String location_name, VersionModel version, String description, String logo, CopyrightModel copyright, String state, String start_time, ArrayList<Social_linksModel> social_links, int id) {

		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this._creator = creator;
		this.privacy = privacy;
		this.timezone = timezone;
		this.email = email;
		this.topic = topic;
		this.background_image = background_image;
		this.name = name;
		this.location_name = location_name;
		this._version = version;
		this.description = description;
		this.logo = logo;
		this._copyright = copyright;
		this.state = state;
		this.start_time = start_time;
		this.social_links = social_links;
		this.id = id;

	}

}