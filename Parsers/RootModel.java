import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String email;
	public CopyrightModel _copyright;
	public String description;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String background_image;
	public String name;
	public String schedule_published_on;
	public String end_time;
	public String logo;
	public int id;
	public String location_name;
	public CreatorModel _creator;
	public String organizer_name;
	public String type;
	public String privacy;
	public String code_of_conduct;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String organizer_description;

	public RootModel(String timezone, String email, CopyrightModel copyright, String description, VersionModel version, Call_for_papersModel call_for_papers, String start_time, String background_image, String name, String schedule_published_on, String end_time, String logo, int id, String location_name, CreatorModel creator, String organizer_name, String type, String privacy, String code_of_conduct, String state, ArrayList<Social_linksModel> social_links, String topic, String organizer_description) {

		this.timezone = timezone;
		this.email = email;
		this._copyright = copyright;
		this.description = description;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.background_image = background_image;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.logo = logo;
		this.id = id;
		this.location_name = location_name;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.type = type;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.social_links = social_links;
		this.topic = topic;
		this.organizer_description = organizer_description;

	}

}