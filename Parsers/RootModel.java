import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String type;
	public int id;
	public String logo;
	public String state;
	public String email;
	public String organizer_description;
	public String start_time;
	public String organizer_name;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String background_image;
	public String end_time;
	public String timezone;
	public String privacy;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String location_name;
	public CreatorModel _creator;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;

	public RootModel(String schedule_published_on, String type, int id, String logo, String state, String email, String organizer_description, String start_time, String organizer_name, VersionModel version, CopyrightModel copyright, String background_image, String end_time, String timezone, String privacy, String name, Call_for_papersModel call_for_papers, String topic, String location_name, CreatorModel creator, String description, ArrayList<Social_linksModel> social_links, String code_of_conduct) {

		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.id = id;
		this.logo = logo;
		this.state = state;
		this.email = email;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this._version = version;
		this._copyright = copyright;
		this.background_image = background_image;
		this.end_time = end_time;
		this.timezone = timezone;
		this.privacy = privacy;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.location_name = location_name;
		this._creator = creator;
		this.description = description;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;

	}

}