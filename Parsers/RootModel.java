import java.util.ArrayList;

class RootModel {

	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String state;
	public String name;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String logo;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String organizer_name;
	public String schedule_published_on;
	public String start_time;
	public CreatorModel _creator;
	public String location_name;
	public String type;
	public VersionModel _version;
	public String organizer_description;
	public int id;
	public String email;
	public String topic;
	public String description;

	public RootModel(String end_time, Call_for_papersModel call_for_papers, String background_image, String state, String name, CopyrightModel copyright, String code_of_conduct, String logo, String timezone, ArrayList<Social_linksModel> social_links, String privacy, String organizer_name, String schedule_published_on, String start_time, CreatorModel creator, String location_name, String type, VersionModel version, String organizer_description, int id, String email, String topic, String description) {

		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.state = state;
		this.name = name;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.timezone = timezone;
		this.social_links = social_links;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this._creator = creator;
		this.location_name = location_name;
		this.type = type;
		this._version = version;
		this.organizer_description = organizer_description;
		this.id = id;
		this.email = email;
		this.topic = topic;
		this.description = description;

	}

}