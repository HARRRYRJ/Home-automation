import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String email;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String organizer_name;
	public String name;
	public String state;
	public String code_of_conduct;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String location_name;
	public String privacy;
	public String type;
	public String topic;
	public String timezone;
	public String organizer_description;
	public CreatorModel _creator;
	public String end_time;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String description;

	public RootModel(String start_time, String email, String schedule_published_on, CopyrightModel copyright, VersionModel version, String organizer_name, String name, String state, String code_of_conduct, String logo, Call_for_papersModel call_for_papers, int id, String location_name, String privacy, String type, String topic, String timezone, String organizer_description, CreatorModel creator, String end_time, String background_image, ArrayList<Social_linksModel> social_links, String description) {

		this.start_time = start_time;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this._version = version;
		this.organizer_name = organizer_name;
		this.name = name;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.location_name = location_name;
		this.privacy = privacy;
		this.type = type;
		this.topic = topic;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.end_time = end_time;
		this.background_image = background_image;
		this.social_links = social_links;
		this.description = description;

	}

}