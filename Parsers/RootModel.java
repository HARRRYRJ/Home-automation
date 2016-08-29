import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String type;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String location_name;
	public String name;
	public String schedule_published_on;
	public String end_time;
	public String state;
	public String logo;
	public String email;
	public String description;
	public String privacy;
	public VersionModel _version;
	public String timezone;
	public String start_time;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String topic;

	public RootModel(String organizer_name, String background_image, ArrayList<Social_linksModel> social_links, String code_of_conduct, String type, CreatorModel creator, CopyrightModel copyright, String location_name, String name, String schedule_published_on, String end_time, String state, String logo, String email, String description, String privacy, VersionModel version, String timezone, String start_time, String organizer_description, Call_for_papersModel call_for_papers, int id, String topic) {

		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this._creator = creator;
		this._copyright = copyright;
		this.location_name = location_name;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.state = state;
		this.logo = logo;
		this.email = email;
		this.description = description;
		this.privacy = privacy;
		this._version = version;
		this.timezone = timezone;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.topic = topic;

	}

}