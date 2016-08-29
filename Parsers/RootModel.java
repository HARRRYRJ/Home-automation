import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String logo;
	public String location_name;
	public String topic;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String background_image;
	public String code_of_conduct;
	public VersionModel _version;
	public String description;
	public String organizer_description;
	public String start_time;
	public String organizer_name;
	public String timezone;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String email;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String state;
	public CreatorModel _creator;

	public RootModel(String end_time, String logo, String location_name, String topic, int id, Call_for_papersModel call_for_papers, String type, String background_image, String code_of_conduct, VersionModel version, String description, String organizer_description, String start_time, String organizer_name, String timezone, String privacy, ArrayList<Social_linksModel> social_links, String name, String email, String schedule_published_on, CopyrightModel copyright, String state, CreatorModel creator) {

		this.end_time = end_time;
		this.logo = logo;
		this.location_name = location_name;
		this.topic = topic;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.description = description;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.privacy = privacy;
		this.social_links = social_links;
		this.name = name;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.state = state;
		this._creator = creator;

	}

}