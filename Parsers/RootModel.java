import java.util.ArrayList;

class RootModel {

	public String state;
	public String description;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String logo;
	public String privacy;
	public String location_name;
	public CreatorModel _creator;
	public String topic;
	public String timezone;
	public String email;
	public String schedule_published_on;
	public String background_image;
	public String name;
	public String start_time;
	public String type;
	public int id;
	public String organizer_name;
	public String organizer_description;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String state, String description, VersionModel version, Call_for_papersModel call_for_papers, String end_time, String logo, String privacy, String location_name, CreatorModel creator, String topic, String timezone, String email, String schedule_published_on, String background_image, String name, String start_time, String type, int id, String organizer_name, String organizer_description, String code_of_conduct, CopyrightModel copyright, ArrayList<Social_linksModel> social_links) {

		this.state = state;
		this.description = description;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.logo = logo;
		this.privacy = privacy;
		this.location_name = location_name;
		this._creator = creator;
		this.topic = topic;
		this.timezone = timezone;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.name = name;
		this.start_time = start_time;
		this.type = type;
		this.id = id;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.social_links = social_links;

	}

}