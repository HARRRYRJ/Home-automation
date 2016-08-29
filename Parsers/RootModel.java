import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public VersionModel _version;
	public String email;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String timezone;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String location_name;
	public int id;
	public String type;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String state;
	public String name;
	public String background_image;
	public String topic;
	public String description;
	public String logo;
	public String organizer_description;
	public CreatorModel _creator;

	public RootModel(String organizer_name, VersionModel version, String email, CopyrightModel copyright, String code_of_conduct, String timezone, String privacy, Call_for_papersModel call_for_papers, String start_time, String location_name, int id, String type, String end_time, ArrayList<Social_linksModel> social_links, String schedule_published_on, String state, String name, String background_image, String topic, String description, String logo, String organizer_description, CreatorModel creator) {

		this.organizer_name = organizer_name;
		this._version = version;
		this.email = email;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.location_name = location_name;
		this.id = id;
		this.type = type;
		this.end_time = end_time;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.name = name;
		this.background_image = background_image;
		this.topic = topic;
		this.description = description;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this._creator = creator;

	}

}