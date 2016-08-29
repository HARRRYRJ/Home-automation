import java.util.ArrayList;

class RootModel {

	public String state;
	public CopyrightModel _copyright;
	public String description;
	public String code_of_conduct;
	public String logo;
	public String start_time;
	public String timezone;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String end_time;
	public String topic;
	public String email;
	public String location_name;
	public CreatorModel _creator;
	public String background_image;
	public String organizer_name;
	public String schedule_published_on;
	public String organizer_description;
	public String name;
	public VersionModel _version;
	public int id;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String state, CopyrightModel copyright, String description, String code_of_conduct, String logo, String start_time, String timezone, String type, Call_for_papersModel call_for_papers, String privacy, String end_time, String topic, String email, String location_name, CreatorModel creator, String background_image, String organizer_name, String schedule_published_on, String organizer_description, String name, VersionModel version, int id, ArrayList<Social_linksModel> social_links) {

		this.state = state;
		this._copyright = copyright;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.start_time = start_time;
		this.timezone = timezone;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.end_time = end_time;
		this.topic = topic;
		this.email = email;
		this.location_name = location_name;
		this._creator = creator;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.name = name;
		this._version = version;
		this.id = id;
		this.social_links = social_links;

	}

}