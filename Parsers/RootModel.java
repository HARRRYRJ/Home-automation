import java.util.ArrayList;

class RootModel {

	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String privacy;
	public String background_image;
	public String organizer_name;
	public CreatorModel _creator;
	public String email;
	public String state;
	public VersionModel _version;
	public String logo;
	public String topic;
	public String timezone;
	public String location_name;
	public String organizer_description;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String type;
	public String code_of_conduct;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String description;

	public RootModel(String end_time, Call_for_papersModel call_for_papers, String name, String privacy, String background_image, String organizer_name, CreatorModel creator, String email, String state, VersionModel version, String logo, String topic, String timezone, String location_name, String organizer_description, String start_time, ArrayList<Social_linksModel> social_links, int id, String type, String code_of_conduct, String schedule_published_on, CopyrightModel copyright, String description) {

		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.privacy = privacy;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.email = email;
		this.state = state;
		this._version = version;
		this.logo = logo;
		this.topic = topic;
		this.timezone = timezone;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.social_links = social_links;
		this.id = id;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.description = description;

	}

}