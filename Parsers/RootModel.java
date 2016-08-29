import java.util.ArrayList;

class RootModel {

	public String type;
	public String location_name;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String background_image;
	public String start_time;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String logo;
	public String end_time;
	public String code_of_conduct;
	public String name;
	public String timezone;
	public String organizer_description;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String topic;
	public String state;
	public String email;

	public RootModel(String type, String location_name, VersionModel version, CopyrightModel copyright, CreatorModel creator, String schedule_published_on, String background_image, String start_time, int id, ArrayList<Social_linksModel> social_links, String privacy, String logo, String end_time, String code_of_conduct, String name, String timezone, String organizer_description, String description, Call_for_papersModel call_for_papers, String organizer_name, String topic, String state, String email) {

		this.type = type;
		this.location_name = location_name;
		this._version = version;
		this._copyright = copyright;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.start_time = start_time;
		this.id = id;
		this.social_links = social_links;
		this.privacy = privacy;
		this.logo = logo;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.state = state;
		this.email = email;

	}

}