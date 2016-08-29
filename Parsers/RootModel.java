import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String organizer_description;
	public String start_time;
	public String type;
	public String logo;
	public String email;
	public String state;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String end_time;
	public String privacy;
	public CreatorModel _creator;
	public String description;
	public String background_image;
	public String name;
	public String schedule_published_on;
	public int id;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public VersionModel _version;
	public String code_of_conduct;

	public RootModel(CopyrightModel copyright, String organizer_description, String start_time, String type, String logo, String email, String state, String organizer_name, ArrayList<Social_linksModel> social_links, String topic, String end_time, String privacy, CreatorModel creator, String description, String background_image, String name, String schedule_published_on, int id, String timezone, Call_for_papersModel call_for_papers, String location_name, VersionModel version, String code_of_conduct) {

		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.type = type;
		this.logo = logo;
		this.email = email;
		this.state = state;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.topic = topic;
		this.end_time = end_time;
		this.privacy = privacy;
		this._creator = creator;
		this.description = description;
		this.background_image = background_image;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this._version = version;
		this.code_of_conduct = code_of_conduct;

	}

}