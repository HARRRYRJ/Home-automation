import java.util.ArrayList;

class RootModel {

	public String type;
	public String code_of_conduct;
	public String state;
	public String privacy;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String start_time;
	public String background_image;
	public String location_name;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String timezone;
	public CreatorModel _creator;
	public String organizer_description;
	public String name;
	public String description;
	public String topic;
	public int id;
	public String logo;
	public String schedule_published_on;

	public RootModel(String type, String code_of_conduct, String state, String privacy, String organizer_name, Call_for_papersModel call_for_papers, VersionModel version, CopyrightModel copyright, String start_time, String background_image, String location_name, String email, ArrayList<Social_linksModel> social_links, String end_time, String timezone, CreatorModel creator, String organizer_description, String name, String description, String topic, int id, String logo, String schedule_published_on) {

		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this._copyright = copyright;
		this.start_time = start_time;
		this.background_image = background_image;
		this.location_name = location_name;
		this.email = email;
		this.social_links = social_links;
		this.end_time = end_time;
		this.timezone = timezone;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.name = name;
		this.description = description;
		this.topic = topic;
		this.id = id;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;

	}

}