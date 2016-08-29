import java.util.ArrayList;

class RootModel {

	public String description;
	public int id;
	public String organizer_name;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String email;
	public String start_time;
	public String type;
	public String schedule_published_on;
	public String timezone;
	public String end_time;
	public String topic;
	public CopyrightModel _copyright;
	public String logo;
	public String name;
	public String organizer_description;
	public String background_image;
	public CreatorModel _creator;
	public VersionModel _version;

	public RootModel(String description, int id, String organizer_name, String location_name, Call_for_papersModel call_for_papers, String state, String code_of_conduct, ArrayList<Social_linksModel> social_links, String privacy, String email, String start_time, String type, String schedule_published_on, String timezone, String end_time, String topic, CopyrightModel copyright, String logo, String name, String organizer_description, String background_image, CreatorModel creator, VersionModel version) {

		this.description = description;
		this.id = id;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.privacy = privacy;
		this.email = email;
		this.start_time = start_time;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.end_time = end_time;
		this.topic = topic;
		this._copyright = copyright;
		this.logo = logo;
		this.name = name;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this._creator = creator;
		this._version = version;

	}

}