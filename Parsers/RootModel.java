import java.util.ArrayList;

class RootModel {

	public String end_time;
	public int id;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String topic;
	public String start_time;
	public CreatorModel _creator;
	public String email;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String name;
	public String background_image;
	public String privacy;
	public String location_name;
	public VersionModel _version;
	public String organizer_name;
	public String logo;
	public String description;
	public String state;
	public String organizer_description;

	public RootModel(String end_time, int id, String schedule_published_on, CopyrightModel copyright, String code_of_conduct, String topic, String start_time, CreatorModel creator, String email, String timezone, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String type, String name, String background_image, String privacy, String location_name, VersionModel version, String organizer_name, String logo, String description, String state, String organizer_description) {

		this.end_time = end_time;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.start_time = start_time;
		this._creator = creator;
		this.email = email;
		this.timezone = timezone;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.name = name;
		this.background_image = background_image;
		this.privacy = privacy;
		this.location_name = location_name;
		this._version = version;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.description = description;
		this.state = state;
		this.organizer_description = organizer_description;

	}

}