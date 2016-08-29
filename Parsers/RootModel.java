import java.util.ArrayList;

class RootModel {

	public String topic;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String end_time;
	public String state;
	public String organizer_description;
	public String type;
	public String code_of_conduct;
	public VersionModel _version;
	public String privacy;
	public String organizer_name;
	public String email;
	public String background_image;
	public String name;
	public String description;
	public int id;
	public String timezone;
	public CreatorModel _creator;

	public RootModel(String topic, String location_name, Call_for_papersModel call_for_papers, String start_time, String logo, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String schedule_published_on, String end_time, String state, String organizer_description, String type, String code_of_conduct, VersionModel version, String privacy, String organizer_name, String email, String background_image, String name, String description, int id, String timezone, CreatorModel creator) {

		this.topic = topic;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.logo = logo;
		this.social_links = social_links;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.state = state;
		this.organizer_description = organizer_description;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.email = email;
		this.background_image = background_image;
		this.name = name;
		this.description = description;
		this.id = id;
		this.timezone = timezone;
		this._creator = creator;

	}

}