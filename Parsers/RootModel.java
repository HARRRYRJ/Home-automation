import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String privacy;
	public CreatorModel _creator;
	public String description;
	public String type;
	public String email;
	public String location_name;
	public String start_time;
	public String schedule_published_on;
	public String organizer_description;
	public String state;
	public int id;
	public CopyrightModel _copyright;
	public String topic;
	public String name;
	public String background_image;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String logo;
	public String organizer_name;
	public VersionModel _version;

	public RootModel(String code_of_conduct, String privacy, CreatorModel creator, String description, String type, String email, String location_name, String start_time, String schedule_published_on, String organizer_description, String state, int id, CopyrightModel copyright, String topic, String name, String background_image, String end_time, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String timezone, String logo, String organizer_name, VersionModel version) {

		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this._creator = creator;
		this.description = description;
		this.type = type;
		this.email = email;
		this.location_name = location_name;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.state = state;
		this.id = id;
		this._copyright = copyright;
		this.topic = topic;
		this.name = name;
		this.background_image = background_image;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.timezone = timezone;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this._version = version;

	}

}