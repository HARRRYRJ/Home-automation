import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String code_of_conduct;
	public int id;
	public String timezone;
	public String state;
	public String privacy;
	public CopyrightModel _copyright;
	public String topic;
	public String organizer_name;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String name;
	public String schedule_published_on;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String logo;
	public String organizer_description;
	public String location_name;
	public CreatorModel _creator;
	public String type;
	public String description;

	public RootModel(String background_image, String code_of_conduct, int id, String timezone, String state, String privacy, CopyrightModel copyright, String topic, String organizer_name, String start_time, Call_for_papersModel call_for_papers, String end_time, String name, String schedule_published_on, VersionModel version, ArrayList<Social_linksModel> social_links, String email, String logo, String organizer_description, String location_name, CreatorModel creator, String type, String description) {

		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.timezone = timezone;
		this.state = state;
		this.privacy = privacy;
		this._copyright = copyright;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.social_links = social_links;
		this.email = email;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this._creator = creator;
		this.type = type;
		this.description = description;

	}

}