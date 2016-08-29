import java.util.ArrayList;

class RootModel {

	public String location_name;
	public CreatorModel _creator;
	public String background_image;
	public String organizer_name;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String code_of_conduct;
	public VersionModel _version;
	public String email;
	public int id;
	public String topic;
	public String name;
	public String end_time;
	public String schedule_published_on;
	public String description;
	public String organizer_description;
	public String state;
	public String timezone;
	public String logo;
	public String type;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String location_name, CreatorModel creator, String background_image, String organizer_name, String privacy, Call_for_papersModel call_for_papers, String start_time, String code_of_conduct, VersionModel version, String email, int id, String topic, String name, String end_time, String schedule_published_on, String description, String organizer_description, String state, String timezone, String logo, String type, CopyrightModel copyright, ArrayList<Social_linksModel> social_links) {

		this.location_name = location_name;
		this._creator = creator;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.email = email;
		this.id = id;
		this.topic = topic;
		this.name = name;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.organizer_description = organizer_description;
		this.state = state;
		this.timezone = timezone;
		this.logo = logo;
		this.type = type;
		this._copyright = copyright;
		this.social_links = social_links;

	}

}