import java.util.ArrayList;

class RootModel {

	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String description;
	public String code_of_conduct;
	public String state;
	public int id;
	public String timezone;
	public String organizer_description;
	public CopyrightModel _copyright;
	public String location_name;
	public String type;
	public String organizer_name;
	public String name;
	public String logo;
	public String start_time;
	public VersionModel _version;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String background_image;
	public String email;
	public String end_time;

	public RootModel(String privacy, Call_for_papersModel call_for_papers, CreatorModel creator, String description, String code_of_conduct, String state, int id, String timezone, String organizer_description, CopyrightModel copyright, String location_name, String type, String organizer_name, String name, String logo, String start_time, VersionModel version, String topic, ArrayList<Social_linksModel> social_links, String schedule_published_on, String background_image, String email, String end_time) {

		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.id = id;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.location_name = location_name;
		this.type = type;
		this.organizer_name = organizer_name;
		this.name = name;
		this.logo = logo;
		this.start_time = start_time;
		this._version = version;
		this.topic = topic;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.email = email;
		this.end_time = end_time;

	}

}