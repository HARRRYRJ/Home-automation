import java.util.ArrayList;

class RootModel {

	public String name;
	public int id;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String logo;
	public String location_name;
	public String type;
	public String description;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String organizer_description;
	public VersionModel _version;
	public String background_image;
	public String state;
	public String timezone;
	public String email;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public String end_time;
	public String topic;

	public RootModel(String name, int id, String organizer_name, CopyrightModel copyright, String logo, String location_name, String type, String description, CreatorModel creator, String schedule_published_on, String organizer_description, VersionModel version, String background_image, String state, String timezone, String email, String code_of_conduct, Call_for_papersModel call_for_papers, String privacy, ArrayList<Social_linksModel> social_links, String start_time, String end_time, String topic) {

		this.name = name;
		this.id = id;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.logo = logo;
		this.location_name = location_name;
		this.type = type;
		this.description = description;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this._version = version;
		this.background_image = background_image;
		this.state = state;
		this.timezone = timezone;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.social_links = social_links;
		this.start_time = start_time;
		this.end_time = end_time;
		this.topic = topic;

	}

}