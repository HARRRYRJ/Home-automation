import java.util.ArrayList;

class RootModel {

	public String description;
	public CopyrightModel _copyright;
	public int id;
	public String email;
	public String background_image;
	public String timezone;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String type;
	public String start_time;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String end_time;
	public String topic;
	public String location_name;
	public String privacy;
	public String state;
	public String organizer_description;
	public VersionModel _version;
	public String name;
	public CreatorModel _creator;

	public RootModel(String description, CopyrightModel copyright, int id, String email, String background_image, String timezone, String logo, Call_for_papersModel call_for_papers, String code_of_conduct, String type, String start_time, String organizer_name, ArrayList<Social_linksModel> social_links, String schedule_published_on, String end_time, String topic, String location_name, String privacy, String state, String organizer_description, VersionModel version, String name, CreatorModel creator) {

		this.description = description;
		this._copyright = copyright;
		this.id = id;
		this.email = email;
		this.background_image = background_image;
		this.timezone = timezone;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.topic = topic;
		this.location_name = location_name;
		this.privacy = privacy;
		this.state = state;
		this.organizer_description = organizer_description;
		this._version = version;
		this.name = name;
		this._creator = creator;

	}

}