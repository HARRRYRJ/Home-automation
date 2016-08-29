import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String type;
	public String logo;
	public String email;
	public String start_time;
	public String location_name;
	public String state;
	public String name;
	public int id;
	public String privacy;
	public String topic;
	public CreatorModel _creator;
	public String background_image;
	public CopyrightModel _copyright;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String organizer_description;
	public String timezone;
	public String end_time;
	public String schedule_published_on;

	public RootModel(String code_of_conduct, ArrayList<Social_linksModel> social_links, String organizer_name, String type, String logo, String email, String start_time, String location_name, String state, String name, int id, String privacy, String topic, CreatorModel creator, String background_image, CopyrightModel copyright, String description, Call_for_papersModel call_for_papers, VersionModel version, String organizer_description, String timezone, String end_time, String schedule_published_on) {

		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.type = type;
		this.logo = logo;
		this.email = email;
		this.start_time = start_time;
		this.location_name = location_name;
		this.state = state;
		this.name = name;
		this.id = id;
		this.privacy = privacy;
		this.topic = topic;
		this._creator = creator;
		this.background_image = background_image;
		this._copyright = copyright;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;

	}

}