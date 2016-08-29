import java.util.ArrayList;

class RootModel {

	public String email;
	public String topic;
	public String organizer_name;
	public CreatorModel _creator;
	public String code_of_conduct;
	public int id;
	public String organizer_description;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public CopyrightModel _copyright;
	public String location_name;
	public String privacy;
	public String end_time;
	public String state;
	public String background_image;
	public String schedule_published_on;
	public String name;
	public VersionModel _version;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String start_time;

	public RootModel(String email, String topic, String organizer_name, CreatorModel creator, String code_of_conduct, int id, String organizer_description, String type, Call_for_papersModel call_for_papers, String description, CopyrightModel copyright, String location_name, String privacy, String end_time, String state, String background_image, String schedule_published_on, String name, VersionModel version, String logo, ArrayList<Social_linksModel> social_links, String timezone, String start_time) {

		this.email = email;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.organizer_description = organizer_description;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this._copyright = copyright;
		this.location_name = location_name;
		this.privacy = privacy;
		this.end_time = end_time;
		this.state = state;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this._version = version;
		this.logo = logo;
		this.social_links = social_links;
		this.timezone = timezone;
		this.start_time = start_time;

	}

}