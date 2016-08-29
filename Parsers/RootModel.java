import java.util.ArrayList;

class RootModel {

	public String type;
	public String location_name;
	public String code_of_conduct;
	public String name;
	public String end_time;
	public String privacy;
	public VersionModel _version;
	public int id;
	public String state;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String background_image;
	public String timezone;
	public String topic;
	public String schedule_published_on;
	public String organizer_name;
	public String description;
	public CreatorModel _creator;
	public String email;
	public String logo;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String type, String location_name, String code_of_conduct, String name, String end_time, String privacy, VersionModel version, int id, String state, String start_time, Call_for_papersModel call_for_papers, CopyrightModel copyright, String background_image, String timezone, String topic, String schedule_published_on, String organizer_name, String description, CreatorModel creator, String email, String logo, String organizer_description, ArrayList<Social_linksModel> social_links) {

		this.type = type;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.end_time = end_time;
		this.privacy = privacy;
		this._version = version;
		this.id = id;
		this.state = state;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.background_image = background_image;
		this.timezone = timezone;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.description = description;
		this._creator = creator;
		this.email = email;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.social_links = social_links;

	}

}