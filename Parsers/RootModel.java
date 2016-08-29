import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String topic;
	public String email;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String description;
	public String schedule_published_on;
	public VersionModel _version;
	public String logo;
	public int id;
	public String start_time;
	public String name;
	public String code_of_conduct;
	public String privacy;
	public String background_image;
	public CreatorModel _creator;
	public String type;
	public String state;
	public String timezone;

	public RootModel(ArrayList<Social_linksModel> social_links, String end_time, String location_name, Call_for_papersModel call_for_papers, String organizer_name, String topic, String email, CopyrightModel copyright, String organizer_description, String description, String schedule_published_on, VersionModel version, String logo, int id, String start_time, String name, String code_of_conduct, String privacy, String background_image, CreatorModel creator, String type, String state, String timezone) {

		this.social_links = social_links;
		this.end_time = end_time;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.email = email;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.logo = logo;
		this.id = id;
		this.start_time = start_time;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.background_image = background_image;
		this._creator = creator;
		this.type = type;
		this.state = state;
		this.timezone = timezone;

	}

}