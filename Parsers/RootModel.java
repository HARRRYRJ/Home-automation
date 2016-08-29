import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public VersionModel _version;
	public String code_of_conduct;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String type;
	public String name;
	public String timezone;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public int id;
	public String privacy;
	public String state;
	public String logo;
	public String organizer_name;
	public String schedule_published_on;
	public String description;
	public String location_name;
	public String email;

	public RootModel(String organizer_description, VersionModel version, String code_of_conduct, CreatorModel creator, CopyrightModel copyright, String type, String name, String timezone, String topic, Call_for_papersModel call_for_papers, String background_image, String start_time, ArrayList<Social_linksModel> social_links, String end_time, int id, String privacy, String state, String logo, String organizer_name, String schedule_published_on, String description, String location_name, String email) {

		this.organizer_description = organizer_description;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this._copyright = copyright;
		this.type = type;
		this.name = name;
		this.timezone = timezone;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.start_time = start_time;
		this.social_links = social_links;
		this.end_time = end_time;
		this.id = id;
		this.privacy = privacy;
		this.state = state;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.location_name = location_name;
		this.email = email;

	}

}