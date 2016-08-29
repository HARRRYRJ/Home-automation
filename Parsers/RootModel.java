import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String end_time;
	public String start_time;
	public String organizer_name;
	public VersionModel _version;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String privacy;
	public CopyrightModel _copyright;
	public String state;
	public CreatorModel _creator;
	public String description;
	public String background_image;
	public String name;
	public String timezone;
	public String email;
	public String logo;
	public int id;
	public String schedule_published_on;
	public String type;

	public RootModel(String organizer_description, Call_for_papersModel call_for_papers, String code_of_conduct, String end_time, String start_time, String organizer_name, VersionModel version, String location_name, ArrayList<Social_linksModel> social_links, String topic, String privacy, CopyrightModel copyright, String state, CreatorModel creator, String description, String background_image, String name, String timezone, String email, String logo, int id, String schedule_published_on, String type) {

		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this._version = version;
		this.location_name = location_name;
		this.social_links = social_links;
		this.topic = topic;
		this.privacy = privacy;
		this._copyright = copyright;
		this.state = state;
		this._creator = creator;
		this.description = description;
		this.background_image = background_image;
		this.name = name;
		this.timezone = timezone;
		this.email = email;
		this.logo = logo;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.type = type;

	}

}