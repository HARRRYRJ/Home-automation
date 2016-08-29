import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String logo;
	public String type;
	public CopyrightModel _copyright;
	public String email;
	public String start_time;
	public String topic;
	public String schedule_published_on;
	public String end_time;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String code_of_conduct;
	public String privacy;
	public String name;
	public String description;
	public String organizer_name;
	public String background_image;
	public String state;
	public String organizer_description;

	public RootModel(VersionModel version, String logo, String type, CopyrightModel copyright, String email, String start_time, String topic, String schedule_published_on, String end_time, int id, ArrayList<Social_linksModel> social_links, CreatorModel creator, String timezone, Call_for_papersModel call_for_papers, String location_name, String code_of_conduct, String privacy, String name, String description, String organizer_name, String background_image, String state, String organizer_description) {

		this._version = version;
		this.logo = logo;
		this.type = type;
		this._copyright = copyright;
		this.email = email;
		this.start_time = start_time;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.id = id;
		this.social_links = social_links;
		this._creator = creator;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.name = name;
		this.description = description;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.state = state;
		this.organizer_description = organizer_description;

	}

}