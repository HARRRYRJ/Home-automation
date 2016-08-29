import java.util.ArrayList;

class RootModel {

	public String email;
	public String logo;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String name;
	public String end_time;
	public CopyrightModel _copyright;
	public String start_time;
	public String state;
	public String organizer_name;
	public String code_of_conduct;
	public String organizer_description;
	public int id;
	public String background_image;
	public String schedule_published_on;
	public String location_name;
	public String type;
	public CreatorModel _creator;
	public VersionModel _version;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String topic;

	public RootModel(String email, String logo, String description, ArrayList<Social_linksModel> social_links, String timezone, String name, String end_time, CopyrightModel copyright, String start_time, String state, String organizer_name, String code_of_conduct, String organizer_description, int id, String background_image, String schedule_published_on, String location_name, String type, CreatorModel creator, VersionModel version, String privacy, Call_for_papersModel call_for_papers, String topic) {

		this.email = email;
		this.logo = logo;
		this.description = description;
		this.social_links = social_links;
		this.timezone = timezone;
		this.name = name;
		this.end_time = end_time;
		this._copyright = copyright;
		this.start_time = start_time;
		this.state = state;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.id = id;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.type = type;
		this._creator = creator;
		this._version = version;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.topic = topic;

	}

}