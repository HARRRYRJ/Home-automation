import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String location_name;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String logo;
	public String start_time;
	public VersionModel _version;
	public String topic;
	public CopyrightModel _copyright;
	public String privacy;
	public String description;
	public String organizer_description;
	public String name;
	public String state;
	public String code_of_conduct;
	public String end_time;
	public String schedule_published_on;
	public String background_image;
	public int id;

	public RootModel(String organizer_name, String timezone, ArrayList<Social_linksModel> social_links, CreatorModel creator, String location_name, String email, Call_for_papersModel call_for_papers, String type, String logo, String start_time, VersionModel version, String topic, CopyrightModel copyright, String privacy, String description, String organizer_description, String name, String state, String code_of_conduct, String end_time, String schedule_published_on, String background_image, int id) {

		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.social_links = social_links;
		this._creator = creator;
		this.location_name = location_name;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.logo = logo;
		this.start_time = start_time;
		this._version = version;
		this.topic = topic;
		this._copyright = copyright;
		this.privacy = privacy;
		this.description = description;
		this.organizer_description = organizer_description;
		this.name = name;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.id = id;

	}

}