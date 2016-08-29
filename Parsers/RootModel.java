import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String logo;
	public String background_image;
	public String privacy;
	public String start_time;
	public String name;
	public String location_name;
	public String timezone;
	public String code_of_conduct;
	public String topic;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public String email;
	public String description;
	public String state;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String end_time;
	public int id;
	public CreatorModel _creator;
	public String organizer_description;

	public RootModel(String organizer_name, String logo, String background_image, String privacy, String start_time, String name, String location_name, String timezone, String code_of_conduct, String topic, VersionModel version, Call_for_papersModel call_for_papers, String schedule_published_on, String email, String description, String state, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String type, String end_time, int id, CreatorModel creator, String organizer_description) {

		this.organizer_name = organizer_name;
		this.logo = logo;
		this.background_image = background_image;
		this.privacy = privacy;
		this.start_time = start_time;
		this.name = name;
		this.location_name = location_name;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.description = description;
		this.state = state;
		this._copyright = copyright;
		this.social_links = social_links;
		this.type = type;
		this.end_time = end_time;
		this.id = id;
		this._creator = creator;
		this.organizer_description = organizer_description;

	}

}