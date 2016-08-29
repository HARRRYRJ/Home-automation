import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String background_image;
	public String location_name;
	public VersionModel _version;
	public String end_time;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String organizer_description;
	public String name;
	public String schedule_published_on;
	public int id;
	public String state;
	public String topic;
	public String privacy;
	public String type;
	public String timezone;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public CreatorModel _creator;
	public String description;
	public String email;

	public RootModel(String code_of_conduct, String background_image, String location_name, VersionModel version, String end_time, String organizer_name, Call_for_papersModel call_for_papers, String logo, String organizer_description, String name, String schedule_published_on, int id, String state, String topic, String privacy, String type, String timezone, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String start_time, CreatorModel creator, String description, String email) {

		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.location_name = location_name;
		this._version = version;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.state = state;
		this.topic = topic;
		this.privacy = privacy;
		this.type = type;
		this.timezone = timezone;
		this._copyright = copyright;
		this.social_links = social_links;
		this.start_time = start_time;
		this._creator = creator;
		this.description = description;
		this.email = email;

	}

}