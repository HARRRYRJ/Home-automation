import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public CreatorModel _creator;
	public String start_time;
	public String description;
	public String schedule_published_on;
	public String name;
	public String timezone;
	public String type;
	public String code_of_conduct;
	public String organizer_description;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public int id;
	public String privacy;
	public String location_name;
	public String topic;
	public String logo;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String email;

	public RootModel(String organizer_name, CreatorModel creator, String start_time, String description, String schedule_published_on, String name, String timezone, String type, String code_of_conduct, String organizer_description, String background_image, ArrayList<Social_linksModel> social_links, VersionModel version, CopyrightModel copyright, int id, String privacy, String location_name, String topic, String logo, String end_time, Call_for_papersModel call_for_papers, String state, String email) {

		this.organizer_name = organizer_name;
		this._creator = creator;
		this.start_time = start_time;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.timezone = timezone;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.social_links = social_links;
		this._version = version;
		this._copyright = copyright;
		this.id = id;
		this.privacy = privacy;
		this.location_name = location_name;
		this.topic = topic;
		this.logo = logo;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.email = email;

	}

}