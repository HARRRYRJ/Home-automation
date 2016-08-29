import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String timezone;
	public String email;
	public String state;
	public String topic;
	public VersionModel _version;
	public String organizer_description;
	public String start_time;
	public String description;
	public CreatorModel _creator;
	public String organizer_name;
	public String schedule_published_on;
	public String end_time;
	public String type;
	public String name;
	public int id;
	public String logo;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String location_name;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String code_of_conduct, String timezone, String email, String state, String topic, VersionModel version, String organizer_description, String start_time, String description, CreatorModel creator, String organizer_name, String schedule_published_on, String end_time, String type, String name, int id, String logo, String privacy, Call_for_papersModel call_for_papers, CopyrightModel copyright, String location_name, String background_image, ArrayList<Social_linksModel> social_links) {

		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.email = email;
		this.state = state;
		this.topic = topic;
		this._version = version;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.description = description;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.type = type;
		this.name = name;
		this.id = id;
		this.logo = logo;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.location_name = location_name;
		this.background_image = background_image;
		this.social_links = social_links;

	}

}