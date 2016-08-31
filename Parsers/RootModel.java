import java.util.ArrayList;

class RootModel {

	public String name;
	public String end_time;
	public String organizer_description;
	public String timezone;
	public String description;
	public String logo;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String email;
	public String location_name;
	public String type;
	public CreatorModel _creator;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String topic;
	public String state;
	public int id;
	public String background_image;
	public String code_of_conduct;

	public RootModel(String name, String end_time, String organizer_description, String timezone, String description, String logo, String schedule_published_on, CopyrightModel copyright, String organizer_name, Call_for_papersModel call_for_papers, VersionModel version, String email, String location_name, String type, CreatorModel creator, String start_time, ArrayList<Social_linksModel> social_links, String privacy, String topic, String state, int id, String background_image, String code_of_conduct) {

		this.name = name;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.description = description;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.email = email;
		this.location_name = location_name;
		this.type = type;
		this._creator = creator;
		this.start_time = start_time;
		this.social_links = social_links;
		this.privacy = privacy;
		this.topic = topic;
		this.state = state;
		this.id = id;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;

	}

}