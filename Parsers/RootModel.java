import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String name;
	public VersionModel _version;
	public String email;
	public String location_name;
	public String background_image;
	public CreatorModel _creator;
	public String description;
	public String state;
	public String logo;
	public CopyrightModel _copyright;
	public String privacy;
	public String organizer_name;
	public String organizer_description;
	public String topic;
	public String code_of_conduct;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String schedule_published_on;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String type;

	public RootModel(String end_time, String name, VersionModel version, String email, String location_name, String background_image, CreatorModel creator, String description, String state, String logo, CopyrightModel copyright, String privacy, String organizer_name, String organizer_description, String topic, String code_of_conduct, String start_time, ArrayList<Social_linksModel> social_links, String timezone, String schedule_published_on, int id, Call_for_papersModel call_for_papers, String type) {

		this.end_time = end_time;
		this.name = name;
		this._version = version;
		this.email = email;
		this.location_name = location_name;
		this.background_image = background_image;
		this._creator = creator;
		this.description = description;
		this.state = state;
		this.logo = logo;
		this._copyright = copyright;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.social_links = social_links;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.type = type;

	}

}