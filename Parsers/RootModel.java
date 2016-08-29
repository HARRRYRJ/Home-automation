import java.util.ArrayList;

class RootModel {

	public String topic;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String location_name;
	public String type;
	public String start_time;
	public String code_of_conduct;
	public String organizer_description;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String timezone;
	public String background_image;
	public String name;
	public String description;
	public String organizer_name;
	public String end_time;
	public CreatorModel _creator;
	public int id;
	public String schedule_published_on;
	public String logo;
	public String state;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String topic, VersionModel version, CopyrightModel copyright, String location_name, String type, String start_time, String code_of_conduct, String organizer_description, String privacy, Call_for_papersModel call_for_papers, String email, String timezone, String background_image, String name, String description, String organizer_name, String end_time, CreatorModel creator, int id, String schedule_published_on, String logo, String state, ArrayList<Social_linksModel> social_links) {

		this.topic = topic;
		this._version = version;
		this._copyright = copyright;
		this.location_name = location_name;
		this.type = type;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.timezone = timezone;
		this.background_image = background_image;
		this.name = name;
		this.description = description;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this._creator = creator;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.state = state;
		this.social_links = social_links;

	}

}