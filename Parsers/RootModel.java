import java.util.ArrayList;

class RootModel {

	public String type;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String organizer_description;
	public int id;
	public String organizer_name;
	public String name;
	public String end_time;
	public String logo;
	public String email;
	public String privacy;
	public VersionModel _version;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public String topic;
	public String state;
	public CreatorModel _creator;
	public String start_time;
	public String location_name;
	public String timezone;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String type, CopyrightModel copyright, String code_of_conduct, String organizer_description, int id, String organizer_name, String name, String end_time, String logo, String email, String privacy, VersionModel version, String schedule_published_on, Call_for_papersModel call_for_papers, String description, String topic, String state, CreatorModel creator, String start_time, String location_name, String timezone, String background_image, ArrayList<Social_linksModel> social_links) {

		this.type = type;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.id = id;
		this.organizer_name = organizer_name;
		this.name = name;
		this.end_time = end_time;
		this.logo = logo;
		this.email = email;
		this.privacy = privacy;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this.topic = topic;
		this.state = state;
		this._creator = creator;
		this.start_time = start_time;
		this.location_name = location_name;
		this.timezone = timezone;
		this.background_image = background_image;
		this.social_links = social_links;

	}

}