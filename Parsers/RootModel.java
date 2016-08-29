import java.util.ArrayList;

class RootModel {

	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String start_time;
	public String topic;
	public CreatorModel _creator;
	public String state;
	public String type;
	public String timezone;
	public String background_image;
	public String privacy;
	public String name;
	public String organizer_description;
	public String description;
	public String location_name;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String email;
	public CopyrightModel _copyright;
	public String organizer_name;
	public int id;
	public String code_of_conduct;

	public RootModel(String end_time, ArrayList<Social_linksModel> social_links, String schedule_published_on, String start_time, String topic, CreatorModel creator, String state, String type, String timezone, String background_image, String privacy, String name, String organizer_description, String description, String location_name, VersionModel version, Call_for_papersModel call_for_papers, String logo, String email, CopyrightModel copyright, String organizer_name, int id, String code_of_conduct) {

		this.end_time = end_time;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this.topic = topic;
		this._creator = creator;
		this.state = state;
		this.type = type;
		this.timezone = timezone;
		this.background_image = background_image;
		this.privacy = privacy;
		this.name = name;
		this.organizer_description = organizer_description;
		this.description = description;
		this.location_name = location_name;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.email = email;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.id = id;
		this.code_of_conduct = code_of_conduct;

	}

}