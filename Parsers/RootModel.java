import java.util.ArrayList;

class RootModel {

	public String state;
	public String email;
	public String background_image;
	public String organizer_name;
	public VersionModel _version;
	public String logo;
	public String type;
	public String schedule_published_on;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String description;
	public String timezone;
	public String end_time;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String code_of_conduct;
	public String privacy;
	public CopyrightModel _copyright;
	public String location_name;
	public CreatorModel _creator;
	public String organizer_description;

	public RootModel(String state, String email, String background_image, String organizer_name, VersionModel version, String logo, String type, String schedule_published_on, String start_time, ArrayList<Social_linksModel> social_links, String topic, String description, String timezone, String end_time, String name, Call_for_papersModel call_for_papers, int id, String code_of_conduct, String privacy, CopyrightModel copyright, String location_name, CreatorModel creator, String organizer_description) {

		this.state = state;
		this.email = email;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this._version = version;
		this.logo = logo;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this.social_links = social_links;
		this.topic = topic;
		this.description = description;
		this.timezone = timezone;
		this.end_time = end_time;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this._copyright = copyright;
		this.location_name = location_name;
		this._creator = creator;
		this.organizer_description = organizer_description;

	}

}