import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String location_name;
	public CopyrightModel _copyright;
	public String start_time;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String timezone;
	public int id;
	public String background_image;
	public String code_of_conduct;
	public String name;
	public String privacy;
	public String organizer_name;
	public String end_time;
	public String state;
	public String topic;
	public String description;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public VersionModel _version;

	public RootModel(String organizer_description, String location_name, CopyrightModel copyright, String start_time, String logo, ArrayList<Social_linksModel> social_links, CreatorModel creator, String schedule_published_on, String timezone, int id, String background_image, String code_of_conduct, String name, String privacy, String organizer_name, String end_time, String state, String topic, String description, String email, Call_for_papersModel call_for_papers, String type, VersionModel version) {

		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this._copyright = copyright;
		this.start_time = start_time;
		this.logo = logo;
		this.social_links = social_links;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.id = id;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.state = state;
		this.topic = topic;
		this.description = description;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this._version = version;

	}

}