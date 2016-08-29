import java.util.ArrayList;

class RootModel {

	public String background_image;
	public int id;
	public String code_of_conduct;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String name;
	public String topic;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String type;
	public String start_time;
	public String description;
	public String privacy;
	public String email;
	public String logo;
	public VersionModel _version;
	public String end_time;
	public String organizer_description;

	public RootModel(String background_image, int id, String code_of_conduct, String schedule_published_on, CopyrightModel copyright, CreatorModel creator, String name, String topic, String organizer_name, ArrayList<Social_linksModel> social_links, String timezone, String location_name, Call_for_papersModel call_for_papers, String state, String type, String start_time, String description, String privacy, String email, String logo, VersionModel version, String end_time, String organizer_description) {

		this.background_image = background_image;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this._creator = creator;
		this.name = name;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.timezone = timezone;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.type = type;
		this.start_time = start_time;
		this.description = description;
		this.privacy = privacy;
		this.email = email;
		this.logo = logo;
		this._version = version;
		this.end_time = end_time;
		this.organizer_description = organizer_description;

	}

}