import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String topic;
	public String code_of_conduct;
	public String start_time;
	public String schedule_published_on;
	public String description;
	public String end_time;
	public String privacy;
	public String location_name;
	public CreatorModel _creator;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String background_image;
	public int id;
	public String state;
	public String logo;
	public String type;
	public String organizer_description;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String timezone;

	public RootModel(ArrayList<Social_linksModel> social_links, String email, String topic, String code_of_conduct, String start_time, String schedule_published_on, String description, String end_time, String privacy, String location_name, CreatorModel creator, String name, Call_for_papersModel call_for_papers, String organizer_name, String background_image, int id, String state, String logo, String type, String organizer_description, CopyrightModel copyright, VersionModel version, String timezone) {

		this.social_links = social_links;
		this.email = email;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.end_time = end_time;
		this.privacy = privacy;
		this.location_name = location_name;
		this._creator = creator;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.id = id;
		this.state = state;
		this.logo = logo;
		this.type = type;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this._version = version;
		this.timezone = timezone;

	}

}