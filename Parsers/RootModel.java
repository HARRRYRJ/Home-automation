import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String logo;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String code_of_conduct;
	public String state;
	public String name;
	public String email;
	public String end_time;
	public String description;
	public int id;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String type;
	public String location_name;
	public String topic;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String timezone;
	public String schedule_published_on;
	public String start_time;

	public RootModel(String privacy, String logo, String organizer_description, ArrayList<Social_linksModel> social_links, VersionModel version, String code_of_conduct, String state, String name, String email, String end_time, String description, int id, String organizer_name, Call_for_papersModel call_for_papers, String background_image, String type, String location_name, String topic, CopyrightModel copyright, CreatorModel creator, String timezone, String schedule_published_on, String start_time) {

		this.privacy = privacy;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.name = name;
		this.email = email;
		this.end_time = end_time;
		this.description = description;
		this.id = id;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.type = type;
		this.location_name = location_name;
		this.topic = topic;
		this._copyright = copyright;
		this._creator = creator;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;

	}

}