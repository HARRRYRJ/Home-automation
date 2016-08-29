import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String location_name;
	public String organizer_name;
	public String type;
	public String topic;
	public String logo;
	public CreatorModel _creator;
	public int id;
	public String state;
	public String start_time;
	public String end_time;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String organizer_description;
	public String background_image;
	public String privacy;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String name;
	public String email;

	public RootModel(String timezone, String location_name, String organizer_name, String type, String topic, String logo, CreatorModel creator, int id, String state, String start_time, String end_time, String description, Call_for_papersModel call_for_papers, String code_of_conduct, ArrayList<Social_linksModel> social_links, VersionModel version, String organizer_description, String background_image, String privacy, CopyrightModel copyright, String schedule_published_on, String name, String email) {

		this.timezone = timezone;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.type = type;
		this.topic = topic;
		this.logo = logo;
		this._creator = creator;
		this.id = id;
		this.state = state;
		this.start_time = start_time;
		this.end_time = end_time;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this._version = version;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.privacy = privacy;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.email = email;

	}

}