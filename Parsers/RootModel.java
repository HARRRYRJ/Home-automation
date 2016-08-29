import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String schedule_published_on;
	public int id;
	public String state;
	public CreatorModel _creator;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String description;
	public String start_time;
	public String background_image;
	public String email;
	public VersionModel _version;
	public String timezone;
	public String name;
	public String privacy;
	public String type;
	public String organizer_name;
	public String topic;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String location_name;

	public RootModel(ArrayList<Social_linksModel> social_links, String organizer_description, String schedule_published_on, int id, String state, CreatorModel creator, String end_time, Call_for_papersModel call_for_papers, String logo, String description, String start_time, String background_image, String email, VersionModel version, String timezone, String name, String privacy, String type, String organizer_name, String topic, String code_of_conduct, CopyrightModel copyright, String location_name) {

		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.state = state;
		this._creator = creator;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.description = description;
		this.start_time = start_time;
		this.background_image = background_image;
		this.email = email;
		this._version = version;
		this.timezone = timezone;
		this.name = name;
		this.privacy = privacy;
		this.type = type;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.location_name = location_name;

	}

}