import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String background_image;
	public String topic;
	public String organizer_description;
	public String logo;
	public CreatorModel _creator;
	public String description;
	public String start_time;
	public String name;
	public String organizer_name;
	public String code_of_conduct;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String type;
	public String privacy;
	public CopyrightModel _copyright;
	public String timezone;
	public String end_time;
	public String email;
	public int id;
	public VersionModel _version;

	public RootModel(String location_name, String background_image, String topic, String organizer_description, String logo, CreatorModel creator, String description, String start_time, String name, String organizer_name, String code_of_conduct, String schedule_published_on, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String state, String type, String privacy, CopyrightModel copyright, String timezone, String end_time, String email, int id, VersionModel version) {

		this.location_name = location_name;
		this.background_image = background_image;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this._creator = creator;
		this.description = description;
		this.start_time = start_time;
		this.name = name;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.type = type;
		this.privacy = privacy;
		this._copyright = copyright;
		this.timezone = timezone;
		this.end_time = end_time;
		this.email = email;
		this.id = id;
		this._version = version;

	}

}