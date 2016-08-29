import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String organizer_description;
	public String topic;
	public String type;
	public String privacy;
	public String code_of_conduct;
	public String schedule_published_on;
	public String location_name;
	public String email;
	public String name;
	public CreatorModel _creator;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String description;
	public int id;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public CopyrightModel _copyright;
	public String start_time;
	public String state;
	public String end_time;

	public RootModel(String organizer_name, String organizer_description, String topic, String type, String privacy, String code_of_conduct, String schedule_published_on, String location_name, String email, String name, CreatorModel creator, String logo, Call_for_papersModel call_for_papers, VersionModel version, String description, int id, String background_image, ArrayList<Social_linksModel> social_links, String timezone, CopyrightModel copyright, String start_time, String state, String end_time) {

		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.type = type;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.email = email;
		this.name = name;
		this._creator = creator;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.description = description;
		this.id = id;
		this.background_image = background_image;
		this.social_links = social_links;
		this.timezone = timezone;
		this._copyright = copyright;
		this.start_time = start_time;
		this.state = state;
		this.end_time = end_time;

	}

}