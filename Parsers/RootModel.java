import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String organizer_name;
	public String type;
	public VersionModel _version;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String email;
	public String logo;
	public String name;
	public String timezone;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String schedule_published_on;
	public int id;
	public String end_time;
	public String state;
	public String privacy;
	public CopyrightModel _copyright;
	public String start_time;
	public String organizer_description;
	public String code_of_conduct;

	public RootModel(String location_name, String organizer_name, String type, VersionModel version, String description, ArrayList<Social_linksModel> social_links, CreatorModel creator, String email, String logo, String name, String timezone, String background_image, Call_for_papersModel call_for_papers, String topic, String schedule_published_on, int id, String end_time, String state, String privacy, CopyrightModel copyright, String start_time, String organizer_description, String code_of_conduct) {

		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.type = type;
		this._version = version;
		this.description = description;
		this.social_links = social_links;
		this._creator = creator;
		this.email = email;
		this.logo = logo;
		this.name = name;
		this.timezone = timezone;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.end_time = end_time;
		this.state = state;
		this.privacy = privacy;
		this._copyright = copyright;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;

	}

}