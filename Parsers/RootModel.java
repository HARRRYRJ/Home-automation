import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String logo;
	public String description;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public VersionModel _version;
	public String name;
	public String timezone;
	public String end_time;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String topic;
	public String start_time;
	public String privacy;
	public String organizer_name;
	public String state;
	public int id;
	public String email;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String type;

	public RootModel(String background_image, String logo, String description, String organizer_description, ArrayList<Social_linksModel> social_links, CreatorModel creator, VersionModel version, String name, String timezone, String end_time, CopyrightModel copyright, String schedule_published_on, String topic, String start_time, String privacy, String organizer_name, String state, int id, String email, String location_name, Call_for_papersModel call_for_papers, String code_of_conduct, String type) {

		this.background_image = background_image;
		this.logo = logo;
		this.description = description;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this._creator = creator;
		this._version = version;
		this.name = name;
		this.timezone = timezone;
		this.end_time = end_time;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.start_time = start_time;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.state = state;
		this.id = id;
		this.email = email;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.type = type;

	}

}