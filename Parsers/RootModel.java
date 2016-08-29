import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String name;
	public String location_name;
	public String email;
	public String type;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String state;
	public String background_image;
	public CopyrightModel _copyright;
	public String topic;
	public VersionModel _version;
	public String privacy;
	public String code_of_conduct;
	public String start_time;
	public String logo;
	public int id;
	public String organizer_name;
	public String description;
	public String end_time;

	public RootModel(String schedule_published_on, Call_for_papersModel call_for_papers, String organizer_description, String name, String location_name, String email, String type, String timezone, ArrayList<Social_linksModel> social_links, CreatorModel creator, String state, String background_image, CopyrightModel copyright, String topic, VersionModel version, String privacy, String code_of_conduct, String start_time, String logo, int id, String organizer_name, String description, String end_time) {

		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.name = name;
		this.location_name = location_name;
		this.email = email;
		this.type = type;
		this.timezone = timezone;
		this.social_links = social_links;
		this._creator = creator;
		this.state = state;
		this.background_image = background_image;
		this._copyright = copyright;
		this.topic = topic;
		this._version = version;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.logo = logo;
		this.id = id;
		this.organizer_name = organizer_name;
		this.description = description;
		this.end_time = end_time;

	}

}