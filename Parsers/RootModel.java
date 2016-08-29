import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String description;
	public String organizer_description;
	public String privacy;
	public String state;
	public String email;
	public CreatorModel _creator;
	public String location_name;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String name;
	public String end_time;
	public String background_image;
	public String logo;
	public String code_of_conduct;
	public String type;
	public String topic;
	public String start_time;
	public CopyrightModel _copyright;
	public String organizer_name;

	public RootModel(VersionModel version, Call_for_papersModel call_for_papers, String timezone, String description, String organizer_description, String privacy, String state, String email, CreatorModel creator, String location_name, int id, ArrayList<Social_linksModel> social_links, String schedule_published_on, String name, String end_time, String background_image, String logo, String code_of_conduct, String type, String topic, String start_time, CopyrightModel copyright, String organizer_name) {

		this._version = version;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.description = description;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.state = state;
		this.email = email;
		this._creator = creator;
		this.location_name = location_name;
		this.id = id;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.end_time = end_time;
		this.background_image = background_image;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.topic = topic;
		this.start_time = start_time;
		this._copyright = copyright;
		this.organizer_name = organizer_name;

	}

}