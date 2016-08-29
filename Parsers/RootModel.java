import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String organizer_description;
	public String organizer_name;
	public String end_time;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public CopyrightModel _copyright;
	public String location_name;
	public int id;
	public String name;
	public String topic;
	public String type;
	public String email;
	public VersionModel _version;
	public CreatorModel _creator;
	public String background_image;
	public String timezone;
	public String schedule_published_on;
	public String logo;
	public String description;

	public RootModel(String start_time, String organizer_description, String organizer_name, String end_time, String state, Call_for_papersModel call_for_papers, String code_of_conduct, ArrayList<Social_linksModel> social_links, String privacy, CopyrightModel copyright, String location_name, int id, String name, String topic, String type, String email, VersionModel version, CreatorModel creator, String background_image, String timezone, String schedule_published_on, String logo, String description) {

		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.privacy = privacy;
		this._copyright = copyright;
		this.location_name = location_name;
		this.id = id;
		this.name = name;
		this.topic = topic;
		this.type = type;
		this.email = email;
		this._version = version;
		this._creator = creator;
		this.background_image = background_image;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.description = description;

	}

}