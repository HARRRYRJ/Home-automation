import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String location_name;
	public String organizer_name;
	public String state;
	public String name;
	public String background_image;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String email;
	public String start_time;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String timezone;
	public String schedule_published_on;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String topic;
	public String description;
	public String end_time;

	public RootModel(String privacy, String location_name, String organizer_name, String state, String name, String background_image, String code_of_conduct, CreatorModel creator, String email, String start_time, int id, Call_for_papersModel call_for_papers, String logo, String timezone, String schedule_published_on, String type, ArrayList<Social_linksModel> social_links, VersionModel version, CopyrightModel copyright, String organizer_description, String topic, String description, String end_time) {

		this.privacy = privacy;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.state = state;
		this.name = name;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.email = email;
		this.start_time = start_time;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.social_links = social_links;
		this._version = version;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.description = description;
		this.end_time = end_time;

	}

}