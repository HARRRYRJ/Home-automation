import java.util.ArrayList;

class RootModel {

	public String topic;
	public String timezone;
	public CopyrightModel _copyright;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public CreatorModel _creator;
	public String state;
	public String location_name;
	public String name;
	public String start_time;
	public int id;
	public String background_image;
	public String organizer_name;
	public String schedule_published_on;
	public String email;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String type;
	public String code_of_conduct;
	public String logo;
	public String end_time;

	public RootModel(String topic, String timezone, CopyrightModel copyright, String description, Call_for_papersModel call_for_papers, String organizer_description, CreatorModel creator, String state, String location_name, String name, String start_time, int id, String background_image, String organizer_name, String schedule_published_on, String email, VersionModel version, ArrayList<Social_linksModel> social_links, String privacy, String type, String code_of_conduct, String logo, String end_time) {

		this.topic = topic;
		this.timezone = timezone;
		this._copyright = copyright;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.state = state;
		this.location_name = location_name;
		this.name = name;
		this.start_time = start_time;
		this.id = id;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this._version = version;
		this.social_links = social_links;
		this.privacy = privacy;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.end_time = end_time;

	}

}