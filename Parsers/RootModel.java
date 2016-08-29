import java.util.ArrayList;

class RootModel {

	public String topic;
	public String organizer_name;
	public String timezone;
	public String privacy;
	public String name;
	public String state;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String logo;
	public VersionModel _version;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String start_time;
	public String location_name;
	public String schedule_published_on;
	public String background_image;
	public String description;
	public String code_of_conduct;
	public int id;
	public CopyrightModel _copyright;
	public String end_time;

	public RootModel(String topic, String organizer_name, String timezone, String privacy, String name, String state, CreatorModel creator, Call_for_papersModel call_for_papers, String email, String logo, VersionModel version, String type, ArrayList<Social_linksModel> social_links, String organizer_description, String start_time, String location_name, String schedule_published_on, String background_image, String description, String code_of_conduct, int id, CopyrightModel copyright, String end_time) {

		this.topic = topic;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.privacy = privacy;
		this.name = name;
		this.state = state;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.logo = logo;
		this._version = version;
		this.type = type;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this._copyright = copyright;
		this.end_time = end_time;

	}

}