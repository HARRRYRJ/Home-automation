import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String logo;
	public VersionModel _version;
	public CreatorModel _creator;
	public String timezone;
	public String description;
	public String location_name;
	public String state;
	public String privacy;
	public String end_time;
	public String name;
	public String background_image;
	public String email;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String start_time;
	public String schedule_published_on;
	public String organizer_name;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String type;

	public RootModel(String organizer_description, String logo, VersionModel version, CreatorModel creator, String timezone, String description, String location_name, String state, String privacy, String end_time, String name, String background_image, String email, CopyrightModel copyright, String code_of_conduct, String start_time, String schedule_published_on, String organizer_name, int id, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String topic, String type) {

		this.organizer_description = organizer_description;
		this.logo = logo;
		this._version = version;
		this._creator = creator;
		this.timezone = timezone;
		this.description = description;
		this.location_name = location_name;
		this.state = state;
		this.privacy = privacy;
		this.end_time = end_time;
		this.name = name;
		this.background_image = background_image;
		this.email = email;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.topic = topic;
		this.type = type;

	}

}