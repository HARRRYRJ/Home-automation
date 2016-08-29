import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public CreatorModel _creator;
	public String code_of_conduct;
	public String organizer_description;
	public CopyrightModel _copyright;
	public String logo;
	public String timezone;
	public String background_image;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String organizer_name;
	public String privacy;
	public String type;
	public String email;
	public String location_name;
	public String name;
	public String description;
	public String state;
	public String schedule_published_on;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;

	public RootModel(VersionModel version, CreatorModel creator, String code_of_conduct, String organizer_description, CopyrightModel copyright, String logo, String timezone, String background_image, String topic, Call_for_papersModel call_for_papers, String start_time, String organizer_name, String privacy, String type, String email, String location_name, String name, String description, String state, String schedule_published_on, int id, ArrayList<Social_linksModel> social_links, String end_time) {

		this._version = version;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.logo = logo;
		this.timezone = timezone;
		this.background_image = background_image;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.type = type;
		this.email = email;
		this.location_name = location_name;
		this.name = name;
		this.description = description;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.social_links = social_links;
		this.end_time = end_time;

	}

}