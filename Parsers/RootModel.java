import java.util.ArrayList;

class RootModel {

	public String topic;
	public int id;
	public String description;
	public String timezone;
	public String code_of_conduct;
	public String state;
	public String location_name;
	public String logo;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String schedule_published_on;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String end_time;
	public String type;
	public String organizer_name;
	public String background_image;
	public CreatorModel _creator;
	public String email;

	public RootModel(String topic, int id, String description, String timezone, String code_of_conduct, String state, String location_name, String logo, String organizer_description, Call_for_papersModel call_for_papers, String privacy, String schedule_published_on, String name, ArrayList<Social_linksModel> social_links, String start_time, VersionModel version, CopyrightModel copyright, String end_time, String type, String organizer_name, String background_image, CreatorModel creator, String email) {

		this.topic = topic;
		this.id = id;
		this.description = description;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.location_name = location_name;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.social_links = social_links;
		this.start_time = start_time;
		this._version = version;
		this._copyright = copyright;
		this.end_time = end_time;
		this.type = type;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this._creator = creator;
		this.email = email;

	}

}