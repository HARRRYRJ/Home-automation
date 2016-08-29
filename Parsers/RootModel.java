import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String type;
	public String organizer_name;
	public String background_image;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public int id;
	public String email;
	public CopyrightModel _copyright;
	public String privacy;
	public String logo;
	public String description;
	public CreatorModel _creator;
	public String code_of_conduct;
	public String name;
	public String start_time;
	public String timezone;
	public String organizer_description;
	public String state;
	public VersionModel _version;

	public RootModel(String schedule_published_on, String type, String organizer_name, String background_image, String location_name, ArrayList<Social_linksModel> social_links, String topic, Call_for_papersModel call_for_papers, String end_time, int id, String email, CopyrightModel copyright, String privacy, String logo, String description, CreatorModel creator, String code_of_conduct, String name, String start_time, String timezone, String organizer_description, String state, VersionModel version) {

		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.location_name = location_name;
		this.social_links = social_links;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.id = id;
		this.email = email;
		this._copyright = copyright;
		this.privacy = privacy;
		this.logo = logo;
		this.description = description;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.start_time = start_time;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.state = state;
		this._version = version;

	}

}