import java.util.ArrayList;

class RootModel {

	public String type;
	public String end_time;
	public String description;
	public String location_name;
	public VersionModel _version;
	public String state;
	public CopyrightModel _copyright;
	public String logo;
	public String schedule_published_on;
	public String timezone;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String privacy;
	public String organizer_description;
	public int id;
	public String organizer_name;
	public String start_time;
	public CreatorModel _creator;
	public String code_of_conduct;
	public String email;
	public String topic;

	public RootModel(String type, String end_time, String description, String location_name, VersionModel version, String state, CopyrightModel copyright, String logo, String schedule_published_on, String timezone, String name, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String background_image, String privacy, String organizer_description, int id, String organizer_name, String start_time, CreatorModel creator, String code_of_conduct, String email, String topic) {

		this.type = type;
		this.end_time = end_time;
		this.description = description;
		this.location_name = location_name;
		this._version = version;
		this.state = state;
		this._copyright = copyright;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.name = name;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.id = id;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.topic = topic;

	}

}