import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String email;
	public CreatorModel _creator;
	public String start_time;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public int id;
	public String description;
	public String location_name;
	public String type;
	public CopyrightModel _copyright;
	public String background_image;
	public String privacy;
	public String name;
	public String topic;
	public String state;
	public String timezone;
	public String code_of_conduct;
	public String end_time;
	public String schedule_published_on;
	public String logo;
	public Call_for_papersModel _call_for_papers;

	public RootModel(VersionModel version, String email, CreatorModel creator, String start_time, String organizer_description, ArrayList<Social_linksModel> social_links, String organizer_name, int id, String description, String location_name, String type, CopyrightModel copyright, String background_image, String privacy, String name, String topic, String state, String timezone, String code_of_conduct, String end_time, String schedule_published_on, String logo, Call_for_papersModel call_for_papers) {

		this._version = version;
		this.email = email;
		this._creator = creator;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.id = id;
		this.description = description;
		this.location_name = location_name;
		this.type = type;
		this._copyright = copyright;
		this.background_image = background_image;
		this.privacy = privacy;
		this.name = name;
		this.topic = topic;
		this.state = state;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this._call_for_papers = call_for_papers;

	}

}