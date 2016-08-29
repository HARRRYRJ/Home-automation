import java.util.ArrayList;

class RootModel {

	public String state;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String location_name;
	public String organizer_name;
	public String type;
	public String logo;
	public String topic;
	public String timezone;
	public CopyrightModel _copyright;
	public String name;
	public String start_time;
	public String background_image;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String code_of_conduct;
	public String organizer_description;
	public String description;
	public String email;
	public int id;
	public VersionModel _version;

	public RootModel(String state, CreatorModel creator, ArrayList<Social_linksModel> social_links, String end_time, String location_name, String organizer_name, String type, String logo, String topic, String timezone, CopyrightModel copyright, String name, String start_time, String background_image, String schedule_published_on, Call_for_papersModel call_for_papers, String privacy, String code_of_conduct, String organizer_description, String description, String email, int id, VersionModel version) {

		this.state = state;
		this._creator = creator;
		this.social_links = social_links;
		this.end_time = end_time;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.type = type;
		this.logo = logo;
		this.topic = topic;
		this.timezone = timezone;
		this._copyright = copyright;
		this.name = name;
		this.start_time = start_time;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.description = description;
		this.email = email;
		this.id = id;
		this._version = version;

	}

}