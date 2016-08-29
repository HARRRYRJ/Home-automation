import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String email;
	public String organizer_description;
	public String organizer_name;
	public String end_time;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String background_image;
	public String description;
	public VersionModel _version;
	public String schedule_published_on;
	public String topic;
	public String timezone;
	public String code_of_conduct;
	public String type;
	public String privacy;
	public String location_name;
	public String start_time;
	public int id;

	public RootModel(CopyrightModel copyright, String email, String organizer_description, String organizer_name, String end_time, String logo, ArrayList<Social_linksModel> social_links, CreatorModel creator, String state, Call_for_papersModel call_for_papers, String name, String background_image, String description, VersionModel version, String schedule_published_on, String topic, String timezone, String code_of_conduct, String type, String privacy, String location_name, String start_time, int id) {

		this._copyright = copyright;
		this.email = email;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.logo = logo;
		this.social_links = social_links;
		this._creator = creator;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.background_image = background_image;
		this.description = description;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.privacy = privacy;
		this.location_name = location_name;
		this.start_time = start_time;
		this.id = id;

	}

}