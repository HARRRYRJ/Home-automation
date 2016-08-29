import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String type;
	public String description;
	public String organizer_description;
	public CreatorModel _creator;
	public String name;
	public CopyrightModel _copyright;
	public String start_time;
	public String location_name;
	public String logo;
	public String privacy;
	public String organizer_name;
	public String background_image;
	public String email;
	public String code_of_conduct;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String topic;
	public int id;
	public String state;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String schedule_published_on, String type, String description, String organizer_description, CreatorModel creator, String name, CopyrightModel copyright, String start_time, String location_name, String logo, String privacy, String organizer_name, String background_image, String email, String code_of_conduct, VersionModel version, Call_for_papersModel call_for_papers, String timezone, String topic, int id, String state, String end_time, ArrayList<Social_linksModel> social_links) {

		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.description = description;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.name = name;
		this._copyright = copyright;
		this.start_time = start_time;
		this.location_name = location_name;
		this.logo = logo;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.topic = topic;
		this.id = id;
		this.state = state;
		this.end_time = end_time;
		this.social_links = social_links;

	}

}