import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String email;
	public String schedule_published_on;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public CreatorModel _creator;
	public String name;
	public String privacy;
	public int id;
	public String topic;
	public String timezone;
	public CopyrightModel _copyright;
	public String start_time;
	public String location_name;
	public String type;
	public String end_time;
	public String code_of_conduct;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String logo;
	public String description;

	public RootModel(String organizer_name, String email, String schedule_published_on, String organizer_description, ArrayList<Social_linksModel> social_links, VersionModel version, CreatorModel creator, String name, String privacy, int id, String topic, String timezone, CopyrightModel copyright, String start_time, String location_name, String type, String end_time, String code_of_conduct, String background_image, Call_for_papersModel call_for_papers, String state, String logo, String description) {

		this.organizer_name = organizer_name;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this._version = version;
		this._creator = creator;
		this.name = name;
		this.privacy = privacy;
		this.id = id;
		this.topic = topic;
		this.timezone = timezone;
		this._copyright = copyright;
		this.start_time = start_time;
		this.location_name = location_name;
		this.type = type;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.logo = logo;
		this.description = description;

	}

}