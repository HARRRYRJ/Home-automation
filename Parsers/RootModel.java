import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public int id;
	public String privacy;
	public CreatorModel _creator;
	public String start_time;
	public String timezone;
	public String description;
	public String name;
	public String background_image;
	public String state;
	public String topic;
	public String schedule_published_on;
	public String location_name;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String end_time;
	public String code_of_conduct;

	public RootModel(String organizer_description, Call_for_papersModel call_for_papers, String type, int id, String privacy, CreatorModel creator, String start_time, String timezone, String description, String name, String background_image, String state, String topic, String schedule_published_on, String location_name, VersionModel version, CopyrightModel copyright, String organizer_name, String email, ArrayList<Social_linksModel> social_links, String logo, String end_time, String code_of_conduct) {

		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.id = id;
		this.privacy = privacy;
		this._creator = creator;
		this.start_time = start_time;
		this.timezone = timezone;
		this.description = description;
		this.name = name;
		this.background_image = background_image;
		this.state = state;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this._version = version;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.email = email;
		this.social_links = social_links;
		this.logo = logo;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;

	}

}