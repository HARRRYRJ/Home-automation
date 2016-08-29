import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String background_image;
	public String timezone;
	public String organizer_name;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String schedule_published_on;
	public VersionModel _version;
	public String code_of_conduct;
	public String topic;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String end_time;
	public String name;
	public String type;
	public String location_name;
	public int id;
	public CopyrightModel _copyright;
	public String state;
	public String start_time;
	public String email;

	public RootModel(String organizer_description, String background_image, String timezone, String organizer_name, String privacy, Call_for_papersModel call_for_papers, String logo, String schedule_published_on, VersionModel version, String code_of_conduct, String topic, String description, ArrayList<Social_linksModel> social_links, CreatorModel creator, String end_time, String name, String type, String location_name, int id, CopyrightModel copyright, String state, String start_time, String email) {

		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.description = description;
		this.social_links = social_links;
		this._creator = creator;
		this.end_time = end_time;
		this.name = name;
		this.type = type;
		this.location_name = location_name;
		this.id = id;
		this._copyright = copyright;
		this.state = state;
		this.start_time = start_time;
		this.email = email;

	}

}