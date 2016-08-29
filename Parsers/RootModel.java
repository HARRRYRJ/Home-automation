import java.util.ArrayList;

class RootModel {

	public String type;
	public String privacy;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String organizer_name;
	public String name;
	public VersionModel _version;
	public String schedule_published_on;
	public String end_time;
	public CopyrightModel _copyright;
	public String location_name;
	public CreatorModel _creator;
	public String code_of_conduct;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public int id;
	public String description;
	public String timezone;
	public String logo;
	public String email;
	public String topic;

	public RootModel(String type, String privacy, String start_time, ArrayList<Social_linksModel> social_links, String background_image, String organizer_name, String name, VersionModel version, String schedule_published_on, String end_time, CopyrightModel copyright, String location_name, CreatorModel creator, String code_of_conduct, String state, Call_for_papersModel call_for_papers, String organizer_description, int id, String description, String timezone, String logo, String email, String topic) {

		this.type = type;
		this.privacy = privacy;
		this.start_time = start_time;
		this.social_links = social_links;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.name = name;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this._copyright = copyright;
		this.location_name = location_name;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.id = id;
		this.description = description;
		this.timezone = timezone;
		this.logo = logo;
		this.email = email;
		this.topic = topic;

	}

}