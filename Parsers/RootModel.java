import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String organizer_description;
	public CreatorModel _creator;
	public String start_time;
	public int id;
	public String organizer_name;
	public String email;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String state;
	public VersionModel _version;
	public String name;
	public String topic;
	public String type;
	public String schedule_published_on;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String description;
	public String logo;
	public String end_time;
	public String timezone;

	public RootModel(CopyrightModel copyright, String organizer_description, CreatorModel creator, String start_time, int id, String organizer_name, String email, String location_name, Call_for_papersModel call_for_papers, String background_image, String state, VersionModel version, String name, String topic, String type, String schedule_published_on, String privacy, ArrayList<Social_linksModel> social_links, String code_of_conduct, String description, String logo, String end_time, String timezone) {

		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.start_time = start_time;
		this.id = id;
		this.organizer_name = organizer_name;
		this.email = email;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.state = state;
		this._version = version;
		this.name = name;
		this.topic = topic;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.logo = logo;
		this.end_time = end_time;
		this.timezone = timezone;

	}

}